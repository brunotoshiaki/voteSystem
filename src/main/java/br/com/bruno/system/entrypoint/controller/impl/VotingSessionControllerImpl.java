package br.com.bruno.system.entrypoint.controller.impl;

import br.com.bruno.system.core.usecase.CreateSessionUseCase;
import br.com.bruno.system.entrypoint.controller.VotingSessionController;
import br.com.bruno.system.entrypoint.controller.mapper.SessionMapper;
import br.com.bruno.system.entrypoint.controller.request.VotingSessionRequest;
import br.com.bruno.system.entrypoint.controller.response.VotingSessionResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value = "/api/v1/session")
@RequiredArgsConstructor
public class VotingSessionControllerImpl implements VotingSessionController {

  private final CreateSessionUseCase createSessionUseCase;

  @Override
  public ResponseEntity<VotingSessionResponse> createSession(VotingSessionRequest request) {
    final var response = createSessionUseCase.insert(SessionMapper.INSTANCE.toVotingSession(request));
    return ResponseEntity.ok().body(response);
  }
}
