package br.com.bruno.system.entrypoint.controller.impl;

import br.com.bruno.system.core.usecase.CreateAssocieteUseCase;
import br.com.bruno.system.entrypoint.controller.AssocieteController;
import br.com.bruno.system.entrypoint.controller.mapper.AssociateMapper;
import br.com.bruno.system.entrypoint.controller.request.AssociateRequest;
import br.com.bruno.system.entrypoint.controller.response.AssociateResponse;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value = "/api/v1/associate")
@RequiredArgsConstructor
public class AssocieteControllerImpl implements AssocieteController {

  private final CreateAssocieteUseCase createAssocieteUseCase;

  @Override
  public ResponseEntity<AssociateResponse> create(@Valid @RequestBody final AssociateRequest associate) {
    var response = createAssocieteUseCase.insert(AssociateMapper.INSTANCE.toAssociate(associate));

    return ResponseEntity.ok().body(response);
  }
}
