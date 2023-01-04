package br.com.bruno.system.dataprovider;

import br.com.bruno.system.core.dataprovider.InsertAssociate;
import br.com.bruno.system.core.domain.Associate;
import br.com.bruno.system.dataprovider.repository.AssociateRepository;
import br.com.bruno.system.dataprovider.repository.mapper.AssocieteEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class InsertAssociateImpl implements InsertAssociate {

  private final AssociateRepository associateRepository;

  @Override
  public void insert(final Associate associate) {
    associateRepository.save(AssocieteEntityMapper.INSTANCE.toAssociateEntity(associate));

  }
}
