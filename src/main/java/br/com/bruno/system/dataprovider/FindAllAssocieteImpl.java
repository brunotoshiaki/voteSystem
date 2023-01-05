package br.com.bruno.system.dataprovider;

import br.com.bruno.system.core.dataprovider.FindAllAssociate;
import br.com.bruno.system.dataprovider.repository.AssociateRepository;
import br.com.bruno.system.dataprovider.repository.entity.AssociateEntity;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class FindAllAssocieteImpl implements FindAllAssociate {

  private final AssociateRepository repository;

  @Override
  public List<AssociateEntity> execute() {

    return repository.findAll();

  }
}
