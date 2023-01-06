package br.com.bruno.system.dataprovider.impl;

import br.com.bruno.system.core.dataprovider.FindByIdAssociete;
import br.com.bruno.system.dataprovider.exception.ObjectNotFoundException;
import br.com.bruno.system.dataprovider.repository.AssociateRepository;
import br.com.bruno.system.dataprovider.repository.entity.AssociateEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class FindByIdAssocieteImpl implements FindByIdAssociete {

  private final AssociateRepository associateRepository;

  @Override
  public AssociateEntity execute(final Long id) {
    final var result = this.associateRepository.findById(id);
    return result.orElseThrow(() -> new ObjectNotFoundException("Associete not find"));
  }
}
