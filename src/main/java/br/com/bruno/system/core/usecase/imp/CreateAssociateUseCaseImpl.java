package br.com.bruno.system.core.usecase.imp;

import br.com.bruno.system.core.dataprovider.InsertAssociate;
import br.com.bruno.system.core.domain.Associate;
import br.com.bruno.system.core.usecase.CreateAssocieteUseCase;
import br.com.bruno.system.core.usecase.mapper.AssociateResponseMapper;
import br.com.bruno.system.entrypoint.controller.response.AssociateResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class CreateAssociateUseCaseImpl implements CreateAssocieteUseCase {

  private final InsertAssociate insertAssociate;

  @Override
  public AssociateResponse insert(final Associate associate) {
    var response = this.insertAssociate.execute(associate);
    return AssociateResponseMapper.INSTANCE.toAssociateResponse(response);
  }
}
