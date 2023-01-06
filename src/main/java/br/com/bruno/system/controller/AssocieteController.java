package br.com.bruno.system.controller;

import br.com.bruno.system.controller.request.AssociateRequest;
import br.com.bruno.system.controller.response.AssociateResponse;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/api/v1/associate")
public interface AssocieteController {

  @PostMapping
  ResponseEntity<AssociateResponse> create(@Valid @RequestBody final AssociateRequest associate);

  @GetMapping
  ResponseEntity<List<AssociateResponse>> findAll();
}
