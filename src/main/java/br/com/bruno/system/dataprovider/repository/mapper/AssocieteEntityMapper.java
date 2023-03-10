package br.com.bruno.system.dataprovider.repository.mapper;

import br.com.bruno.system.core.domain.Associate;
import br.com.bruno.system.dataprovider.repository.entity.AssociateEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper()
public interface AssocieteEntityMapper {

  AssocieteEntityMapper INSTANCE = Mappers.getMapper(AssocieteEntityMapper.class);

  @Mapping(target = "id", ignore = true)
  AssociateEntity toAssociateEntity(final Associate associate);


}
