package br.com.bruno.system.core.usecase.mapper;

import br.com.bruno.system.dataprovider.repository.entity.VotingSessionEntity;
import br.com.bruno.system.entrypoint.controller.response.VotingSessionResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SessionResponseMapper {

  SessionResponseMapper INSTANCE = Mappers.getMapper(SessionResponseMapper.class);

  @Mapping(source = "creationTime", target = "dateVoting", dateFormat = "dd.MM.yyyy-HH:mm")
  VotingSessionResponse toSessionResponse(final VotingSessionEntity entity);
}
