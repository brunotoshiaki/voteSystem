package br.com.bruno.system.dataprovider.impl;

import br.com.bruno.system.core.dataprovider.DoesSessionHasSchedule;
import br.com.bruno.system.dataprovider.repository.SessionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class DoesSessionHasScheduleImpl implements DoesSessionHasSchedule {

  private final SessionRepository sessionRepository;


  @Override
  public boolean execute(final Long id) {
    return this.sessionRepository
        .findSessionEntityByScheduleId(id)
        .isPresent();
  }
}
