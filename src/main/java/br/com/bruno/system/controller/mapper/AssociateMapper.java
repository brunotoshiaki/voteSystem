package br.com.bruno.system.controller.mapper;

import br.com.bruno.system.controller.request.AssociateRequest;
import br.com.bruno.system.core.domain.Associate;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AssociateMapper {

  AssociateMapper INSTANCE = Mappers.getMapper(AssociateMapper.class);


  Associate toAssociate(final AssociateRequest associateRequest);
}
