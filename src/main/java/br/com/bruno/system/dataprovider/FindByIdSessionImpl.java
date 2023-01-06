package br.com.bruno.system.dataprovider;

import br.com.bruno.system.core.dataprovider.FindByIdSession;
import br.com.bruno.system.dataprovider.repository.entity.ScheduleEntity;
import java.util.Optional;

public class FindByIdSessionImpl implements FindByIdSession {


  @Override
  public Optional<ScheduleEntity> findById(final Long id) {
    return Optional.empty();
  }
}
