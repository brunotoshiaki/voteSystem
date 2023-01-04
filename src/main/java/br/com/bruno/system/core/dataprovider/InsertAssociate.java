package br.com.bruno.system.core.dataprovider;

import br.com.bruno.system.core.domain.Associate;
import br.com.bruno.system.dataprovider.repository.entity.AssociateEntity;

public interface InsertAssociate {

  AssociateEntity execute(final Associate associate);
}
