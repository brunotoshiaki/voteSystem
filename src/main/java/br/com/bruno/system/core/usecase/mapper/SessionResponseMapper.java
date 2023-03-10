package br.com.bruno.system.core.usecase.mapper;

import br.com.bruno.system.controller.response.SessionResponse;
import br.com.bruno.system.dataprovider.repository.entity.SessionEntity;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SessionResponseMapper {

  SessionResponseMapper INSTANCE = Mappers.getMapper(SessionResponseMapper.class);

  @Mapping(source = "creationTime", target = "dateVoting", dateFormat = "dd.MM.yyyy-HH:mm")
  SessionResponse toSessionResponse(final SessionEntity entity);

  @Mapping(source = "creationTime", target = "dateVoting", dateFormat = "dd.MM.yyyy-HH:mm")
  List<SessionResponse> toSessionsResponse(final List<SessionEntity> entites);

}
