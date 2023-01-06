package br.com.bruno.system.controller.mapper;

import br.com.bruno.system.controller.request.SessionRequest;
import br.com.bruno.system.core.domain.Session;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SessionMapper {

  SessionMapper INSTANCE = Mappers.getMapper(SessionMapper.class);

  Session toSession(final SessionRequest request);

}
