package br.com.bruno.system.entrypoint.controller;

import br.com.bruno.system.entrypoint.controller.request.VoteRequest;
import br.com.bruno.system.entrypoint.controller.response.VoteResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface VoteController {

  @PostMapping
  ResponseEntity<Void> vote(@Valid @RequestBody final VoteRequest request);

  @GetMapping
  ResponseEntity<VoteResponse> getResult();

}
