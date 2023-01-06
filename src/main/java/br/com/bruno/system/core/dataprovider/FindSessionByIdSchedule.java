package br.com.bruno.system.core.dataprovider;

import br.com.bruno.system.dataprovider.repository.entity.SessionEntity;
import java.util.Optional;

public interface FindSessionByIdSchedule {

  Optional<SessionEntity> findByIdSchedule(final Long id);

}
