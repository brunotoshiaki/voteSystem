package br.com.bruno.system.dataprovider.mapper;

import br.com.bruno.system.dataprovider.repository.entity.AssociateEntity;
import br.com.bruno.system.entrypoint.controller.response.AssociateResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AssociateResponseMapper {

  AssociateResponseMapper INSTANCE = Mappers.getMapper(AssociateResponseMapper.class);

  AssociateResponse toAssociateResponse(final AssociateEntity entity);

}
