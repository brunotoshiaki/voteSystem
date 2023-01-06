package br.com.bruno.system.controller;

import br.com.bruno.system.controller.request.SessionRequest;
import br.com.bruno.system.controller.response.SessionResponse;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/api/v1/session")
public interface SessionController {

  @PostMapping
  ResponseEntity<SessionResponse> createSession(@Valid @RequestBody final SessionRequest request);

  @GetMapping
  ResponseEntity<List<SessionResponse>> findAll();
}
