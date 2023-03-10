package br.com.bruno.system.core.usecase.mapper;

import br.com.bruno.system.controller.response.AssociateResponse;
import br.com.bruno.system.dataprovider.repository.entity.AssociateEntity;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AssociateResponseMapper {

  AssociateResponseMapper INSTANCE = Mappers.getMapper(AssociateResponseMapper.class);

  AssociateResponse toAssociateResponse(final AssociateEntity entity);

  List<AssociateResponse> toAssociatesResponse(final List<AssociateEntity> entities);

}
