package br.com.bruno.system.core.dataprovider;

import br.com.bruno.system.dataprovider.repository.entity.AssociateEntity;
import java.util.List;

public interface FindAllAssociate {

  List<AssociateEntity> execute();
}
