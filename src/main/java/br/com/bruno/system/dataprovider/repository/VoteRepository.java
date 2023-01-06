package br.com.bruno.system.dataprovider.repository;

import br.com.bruno.system.dataprovider.repository.entity.VoteEntity;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<VoteEntity, Long> {

  Optional<VoteEntity> findVoteEntityByScheduleIdAndAssociateId(final Long idSchedule, final Long idAssociete);

  List<VoteEntity> findVoteEntityByVote(final boolean vote);
}
