package br.com.bruno.system.entrypoint.controller.exception;

import br.com.bruno.system.dataprovider.exception.ObjectNotFoundException;
import java.time.LocalDateTime;
import lombok.extern.slf4j.Slf4j;
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
    final var error = new ErrorModel(HttpStatus.BAD_REQUEST.value(), LocalDateTime.now(), "Required request body");
    return ResponseEntity.status(HttpStatus.BAD_REQUEST.value()).body(error);
  }

  @ExceptionHandler(ObjectNotFoundException.class)
  protected ResponseEntity<ErrorModel> handleObjectNotFoundException() {
    final var error = new ErrorModel(HttpStatus.NOT_FOUND.value(), LocalDateTime.now(), "Object Not Found");
    return ResponseEntity.status(HttpStatus.NOT_FOUND.value()).body(error);
  }
}
