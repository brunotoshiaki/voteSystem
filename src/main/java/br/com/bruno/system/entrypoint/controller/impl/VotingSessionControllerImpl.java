package br.com.bruno.system.entrypoint.controller.impl;

import br.com.bruno.system.core.usecase.CreateSessionUseCase;
import br.com.bruno.system.core.usecase.FindAllSessionUseCase;
import br.com.bruno.system.entrypoint.controller.VotingSessionController;
import br.com.bruno.system.entrypoint.controller.mapper.SessionMapper;
import br.com.bruno.system.entrypoint.controller.request.VotingSessionRequest;
import br.com.bruno.system.entrypoint.controller.response.VotingSessionResponse;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value = "/api/v1/session")
@RequiredArgsConstructor
public class VotingSessionControllerImpl implements VotingSessionController {

  private final CreateSessionUseCase createSessionUseCase;
  private final FindAllSessionUseCase findAllSessionUseCase;

  @Override
  public ResponseEntity<VotingSessionResponse> createSession(final VotingSessionRequest request) {
    final var response = this.createSessionUseCase.insert(SessionMapper.INSTANCE.toVotingSession(request));
    return ResponseEntity.ok().body(response);
  }

  @Override
  public ResponseEntity<List<VotingSessionResponse>> findAll() {
    final var response = this.findAllSessionUseCase.findAll();
    return ResponseEntity.ok().body(response);
  }
}
