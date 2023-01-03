package br.com.bruno.system.dataprovider.repository.mapper;

import br.com.bruno.system.core.domain.Associate;
import br.com.bruno.system.dataprovider.repository.entity.AssociateEntity;
import org.mapstruct.Mapper;

@Mapper()
public interface AssocieteEntityMapper {

  AssociateEntity toAssociateEntity(final Associate associate);

  Associate toAssociate(final AssociateEntity associateEntity);

}
