package br.com.bruno.system.controller.impl;

import br.com.bruno.system.controller.AssocieteController;
import br.com.bruno.system.controller.mapper.AssociateMapper;
import br.com.bruno.system.controller.request.AssociateRequest;
import br.com.bruno.system.controller.response.AssociateResponse;
import br.com.bruno.system.core.usecase.CreateAssocieteUseCase;
import br.com.bruno.system.core.usecase.FindAllAssociateUseCase;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController()
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
