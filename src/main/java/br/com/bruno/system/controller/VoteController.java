package br.com.bruno.system.controller;

import br.com.bruno.system.controller.request.VoteRequest;
import br.com.bruno.system.controller.response.VoteResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/api/v1/vote")
public interface VoteController {

  @PostMapping
  ResponseEntity<Void> vote(@Valid @RequestBody final VoteRequest request);

  @GetMapping("/{id}")
  ResponseEntity<VoteResponse> getResult(@PathVariable final Long id);

}
