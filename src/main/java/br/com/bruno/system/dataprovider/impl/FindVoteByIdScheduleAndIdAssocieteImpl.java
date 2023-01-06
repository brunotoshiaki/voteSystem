package br.com.bruno.system.dataprovider.impl;

import br.com.bruno.system.core.dataprovider.FindVoteByIdScheduleAndIdAssociete;
import br.com.bruno.system.dataprovider.repository.VoteRepository;
import br.com.bruno.system.dataprovider.repository.entity.VoteEntity;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class FindVoteByIdScheduleAndIdAssocieteImpl implements FindVoteByIdScheduleAndIdAssociete {


  private final VoteRepository voteRepository;

  @Override
  public Optional<VoteEntity> execute(final Long idSchedule, final Long idAssociete) {
    return this.voteRepository.findVoteEntityByScheduleIdAndAssociateId(idSchedule, idAssociete);
  }
}
