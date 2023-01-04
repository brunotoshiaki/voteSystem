package br.com.bruno.system.entrypoint.controller.mapper;

import br.com.bruno.system.core.domain.Associate;
import br.com.bruno.system.entrypoint.controller.request.AssociateRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AssociateMapper {

  AssociateMapper INSTANCE = Mappers.getMapper(AssociateMapper.class);


  Associate toAssociate(final AssociateRequest associateRequest);
}
