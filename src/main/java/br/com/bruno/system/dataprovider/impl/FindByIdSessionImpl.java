package br.com.bruno.system.dataprovider.impl;

import br.com.bruno.system.core.dataprovider.FindByIdSession;
import br.com.bruno.system.dataprovider.exception.ObjectNotFoundException;
import br.com.bruno.system.dataprovider.repository.SessionRepository;
import br.com.bruno.system.dataprovider.repository.entity.SessionEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class FindByIdSessionImpl implements FindByIdSession {

  private final SessionRepository sessionRepository;

  @Override
  public SessionEntity execute(final Long id) {
    final var result = sessionRepository.findById(id);
    return result.orElseThrow(() -> new ObjectNotFoundException("Session not find"));
  }
}
