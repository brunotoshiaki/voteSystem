package br.com.bruno.system.core.dataprovider;

import br.com.bruno.system.dataprovider.repository.entity.AssociateEntity;

public interface FindByIdAssociete {

 AssociateEntity execute(final Long id);
}
