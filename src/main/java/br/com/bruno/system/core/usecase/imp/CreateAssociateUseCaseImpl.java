package br.com.bruno.system.core.usecase.imp;

import br.com.bruno.system.core.dataprovider.InsertAssociate;
import br.com.bruno.system.core.domain.Associate;
import br.com.bruno.system.core.usecase.CreateAssocieteUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class CreateAssociateUseCaseImpl implements CreateAssocieteUseCase {

  private final InsertAssociate insertAssociate;

  @Override
  public void insert(final Associate associate) {
    this.insertAssociate.insert(associate);
  }
}
