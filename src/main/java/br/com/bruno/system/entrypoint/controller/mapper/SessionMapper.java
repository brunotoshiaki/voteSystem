package br.com.bruno.system.entrypoint.controller.mapper;

import br.com.bruno.system.core.domain.VotingSession;
import br.com.bruno.system.entrypoint.controller.request.VotingSessionRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SessionMapper {

  SessionMapper INSTANCE = Mappers.getMapper(SessionMapper.class);

  VotingSession toVotingSession(final VotingSessionRequest request);

}
