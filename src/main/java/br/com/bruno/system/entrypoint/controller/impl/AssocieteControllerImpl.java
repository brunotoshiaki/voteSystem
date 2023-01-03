package br.com.bruno.system.entrypoint.controller.impl;

import br.com.bruno.system.entrypoint.controller.AssocieteController;
import br.com.bruno.system.entrypoint.controller.request.AssociateRequest;
import br.com.bruno.system.entrypoint.controller.response.AssociateResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value = "/associate")
@RequiredArgsConstructor
public class AssocieteControllerImpl implements AssocieteController {


  @Override
  public ResponseEntity<AssociateResponse> create(final AssociateRequest associate) {
    return null;
  }
}
