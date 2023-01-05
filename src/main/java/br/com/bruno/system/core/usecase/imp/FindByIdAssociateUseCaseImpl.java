package br.com.bruno.system.core.usecase.imp;

import br.com.bruno.system.core.dataprovider.FindByIdAssociete;
import br.com.bruno.system.core.usecase.FindByIdAssociateUseCase;
import br.com.bruno.system.core.usecase.mapper.AssociateResponseMapper;
import br.com.bruno.system.entrypoint.controller.response.AssociateResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FindByIdAssociateUseCaseImpl implements FindByIdAssociateUseCase {

  private final FindByIdAssociete findByIdAssociete;

  @Override
  public AssociateResponse findById(final Long id) {
    final var response = this.findByIdAssociete.execute(id);
    return AssociateResponseMapper.INSTANCE.toAssociateResponse(response);
  }
}
