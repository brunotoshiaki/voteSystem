package br.com.bruno.system.core.dataprovider;

import br.com.bruno.system.dataprovider.repository.entity.VoteEntity;
import java.util.Optional;

public interface FindVoteByIdScheduleAndIdAssociete {

  Optional<VoteEntity> execute(final Long idSchedule, final Long idAssociete);
}
