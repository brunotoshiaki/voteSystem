package br.com.bruno.system.core.usecase.imp;

import br.com.bruno.system.controller.response.AssociateResponse;
import br.com.bruno.system.core.dataprovider.FindAllAssociate;
import br.com.bruno.system.core.usecase.FindAllAssociateUseCase;
import br.com.bruno.system.core.usecase.mapper.AssociateResponseMapper;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FindAllAssociateUseCaseImpl implements FindAllAssociateUseCase {

  private final FindAllAssociate findAllAssociate;

  @Override
  public List<AssociateResponse> finadAll() {
    final var response = findAllAssociate.execute();
    return AssociateResponseMapper.INSTANCE.toAssociatesResponse(response);
  }
}
