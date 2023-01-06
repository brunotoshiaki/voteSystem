package br.com.bruno.system.controller.impl;

import br.com.bruno.system.controller.SessionController;
import br.com.bruno.system.controller.mapper.SessionMapper;
import br.com.bruno.system.controller.request.SessionRequest;
import br.com.bruno.system.controller.response.SessionResponse;
import br.com.bruno.system.core.usecase.CreateSessionUseCase;
import br.com.bruno.system.core.usecase.FindAllSessionUseCase;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequiredArgsConstructor
public class SessionControllerImpl implements SessionController {

  private final CreateSessionUseCase createSessionUseCase;
  private final FindAllSessionUseCase findAllSessionUseCase;

  @Override
  public ResponseEntity<SessionResponse> createSession(final SessionRequest request) {
    final var response = this.createSessionUseCase.insert(SessionMapper.INSTANCE.toSession(request));
    return ResponseEntity.ok().body(response);
  }

  @Override
  public ResponseEntity<List<SessionResponse>> findAll() {
    final var response = this.findAllSessionUseCase.findAll();
    return ResponseEntity.ok().body(response);
  }
}
