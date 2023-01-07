package br.com.bruno.system.controller.exception;

import br.com.bruno.system.dataprovider.exception.AssocieteAlreadyVotedException;
import br.com.bruno.system.dataprovider.exception.ObjectNotFoundException;
import br.com.bruno.system.dataprovider.exception.ScheduleAlreadyCreatedExeption;
import br.com.bruno.system.dataprovider.exception.SessionAlredyCloseExeption;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import java.time.LocalDateTime;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class RestExceptionHandler {

  @ExceptionHandler(MethodArgumentNotValidException.class)
  protected ResponseEntity<ErrorModel> handleMethodArgumentNotValid(final MethodArgumentNotValidException ex) {
    log.error(ex.getMessage());
    final var firstError = ex.getBindingResult()
        .getAllErrors()
        .stream()
        .findFirst()
        .orElseThrow(IllegalStateException::new);

    final var error = new ErrorModel(HttpStatus.BAD_REQUEST.value(), LocalDateTime.now(), firstError.getDefaultMessage());
    return ResponseEntity.status(HttpStatus.BAD_REQUEST.value()).body(error);
  }

  @ExceptionHandler(HttpMessageNotReadableException.class)
  protected ResponseEntity<ErrorModel> handleNotReadableException(final HttpMessageNotReadableException ex) {
    log.error(ex.getMessage());
    final var errorDetails = this.getErrorDetails(ex);
    final var error = new ErrorModel(HttpStatus.BAD_REQUEST.value(), LocalDateTime.now(),
        StringUtils.isBlank(errorDetails) ? ex.getMessage() : errorDetails);
    return ResponseEntity.status(HttpStatus.BAD_REQUEST.value()).body(error);
  }

  @ExceptionHandler(ObjectNotFoundException.class)
  protected ResponseEntity<ErrorModel> handleObjectNotFoundException(final ObjectNotFoundException ex) {
    log.error(ex.getMessage());
    final var error = new ErrorModel(HttpStatus.NOT_FOUND.value(), LocalDateTime.now(), ex.getMessage());
    return ResponseEntity.status(HttpStatus.NOT_FOUND.value()).body(error);
  }

  @ExceptionHandler(ScheduleAlreadyCreatedExeption.class)
  protected ResponseEntity<ErrorModel> handleScheduleAlreadyCreatedException() {
    log.error("Schedule Already Created");
    final var error = new ErrorModel(HttpStatus.FORBIDDEN.value(), LocalDateTime.now(), "Schedule Already Created");
    return ResponseEntity.status(HttpStatus.FORBIDDEN.value()).body(error);
  }

  @ExceptionHandler(AssocieteAlreadyVotedException.class)
  protected ResponseEntity<ErrorModel> handleAssocieteAlreadyVotedException() {
    log.error("Associete Already Voted");
    final var error = new ErrorModel(HttpStatus.FORBIDDEN.value(), LocalDateTime.now(), "Associete Already Voted");
    return ResponseEntity.status(HttpStatus.FORBIDDEN.value()).body(error);
  }

  @ExceptionHandler(SessionAlredyCloseExeption.class)
  protected ResponseEntity<ErrorModel> handleSessionAlredyCloseExeption() {
    log.error("Session Alredy Close");
    final var error = new ErrorModel(HttpStatus.FORBIDDEN.value(), LocalDateTime.now(), "Session Alredy Close");
    return ResponseEntity.status(HttpStatus.FORBIDDEN.value()).body(error);
  }

  private String getErrorDetails(final HttpMessageNotReadableException ex) {
    if ((ex.getCause() instanceof InvalidFormatException ifx) && (ifx.getTargetType() != null && ifx.getTargetType().isEnum())) {
      return String.format("Invalid enum value: '%s' for the field: '%s'. The value must be one of: %s.",
          ifx.getValue(), ifx.getPath().get(ifx.getPath().size() - 1).getFieldName(), Arrays.toString(ifx.getTargetType().getEnumConstants()));
    }
    return "";
  }
}
