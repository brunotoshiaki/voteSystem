package br.com.bruno.system.entrypoint.controller;

import br.com.bruno.system.entrypoint.controller.request.SessionRequest;
import br.com.bruno.system.entrypoint.controller.response.SessionResponse;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface SessionController {

  @PostMapping
  ResponseEntity<SessionResponse> createSession(@Valid @RequestBody final SessionRequest request);

  @GetMapping
  ResponseEntity<List<SessionResponse>> findAll();
}
