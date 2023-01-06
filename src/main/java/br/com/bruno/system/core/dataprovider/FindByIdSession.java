package br.com.bruno.system.core.dataprovider;

import br.com.bruno.system.dataprovider.repository.entity.ScheduleEntity;
import java.util.Optional;

public interface FindByIdSession {

  Optional<ScheduleEntity> findById(final Long id);
}
