package br.com.bruno.system.entrypoint.controller.impl;

import br.com.bruno.system.core.usecase.CreateAssocieteUseCase;
import br.com.bruno.system.core.usecase.FindAllAssociateUseCase;
import br.com.bruno.system.entrypoint.controller.AssocieteController;
import br.com.bruno.system.entrypoint.controller.mapper.AssociateMapper;
import br.com.bruno.system.entrypoint.controller.request.AssociateRequest;
import br.com.bruno.system.entrypoint.controller.response.AssociateResponse;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value = "/api/v1/associate")
@RequiredArgsConstructor
public class AssocieteControllerImpl implements AssocieteController {

  private final CreateAssocieteUseCase createAssocieteUseCase;

  private final FindAllAssociateUseCase findAllAssociateUseCase;

  @Override
  public ResponseEntity<AssociateResponse> create(final AssociateRequest associate) {
    final var response = this.createAssocieteUseCase.insert(AssociateMapper.INSTANCE.toAssociate(associate));
    return ResponseEntity.ok().body(response);
  }

  @Override
  public ResponseEntity<List<AssociateResponse>> findAll() {
    final var response = this.findAllAssociateUseCase.finadAll();
    return ResponseEntity.ok().body(response);
  }
}
