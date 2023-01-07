package br.com.bruno.system.dataprovider.impl;

import br.com.bruno.system.core.dataprovider.DoesScheduleHasVote;
import br.com.bruno.system.dataprovider.repository.VoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class DoesScheduleHasVoteImpl implements DoesScheduleHasVote {

  private final VoteRepository voteRepository;

  @Override
  public boolean execute(final Long idSchedule, final Long idAssociete) {
    return this.voteRepository
        .findVoteEntityByScheduleIdAndAssociateId(idSchedule, idAssociete)
        .isPresent();
  }
}
