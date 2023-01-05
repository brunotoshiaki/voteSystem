package br.com.bruno.system.core.dataprovider;

import br.com.bruno.system.dataprovider.repository.entity.VotingSessionEntity;
import java.util.Optional;

public interface FindSessionByIdSchedule {

  Optional<VotingSessionEntity> findByIdSchedule(final Long id);

}
