package br.com.bruno.system.entrypoint.controller;

import br.com.bruno.system.entrypoint.controller.request.AssociateRequest;
import br.com.bruno.system.entrypoint.controller.response.AssociateResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface AssocieteController {

  @PostMapping
  ResponseEntity<AssociateResponse> create(@RequestBody final AssociateRequest associate);
}