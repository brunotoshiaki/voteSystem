package br.com.bruno.system.entrypoint.controller;

import br.com.bruno.system.entrypoint.controller.request.AssociateRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface AssocieteController {

  @PostMapping
  ResponseEntity<Void> create(@RequestBody final AssociateRequest associate);
}
