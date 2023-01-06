package br.com.bruno.system.entrypoint.controller.mapper;

import br.com.bruno.system.core.domain.Session;
import br.com.bruno.system.entrypoint.controller.request.SessionRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SessionMapper {

  SessionMapper INSTANCE = Mappers.getMapper(SessionMapper.class);

  Session toSession(final SessionRequest request);

}
