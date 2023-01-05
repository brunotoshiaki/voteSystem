package br.com.bruno.system.entrypoint.controller;

import br.com.bruno.system.entrypoint.controller.request.VotingSessionRequest;
import br.com.bruno.system.entrypoint.controller.response.VotingSessionResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface VotingSessionController {

  @PostMapping
  ResponseEntity<VotingSessionResponse> createSession(@Valid @RequestBody final VotingSessionRequest request);
}
