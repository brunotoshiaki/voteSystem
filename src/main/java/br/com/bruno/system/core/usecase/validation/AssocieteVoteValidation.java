package br.com.bruno.system.core.usecase.validation;

import br.com.bruno.system.core.dataprovider.DoesScheduleHasVote;
import br.com.bruno.system.core.dataprovider.VoteChain;
import br.com.bruno.system.core.domain.ValidVote;
import br.com.bruno.system.dataprovider.exception.AssocieteAlreadyVotedException;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
@Getter
public class AssocieteVoteValidation implements VoteChain {

  private final DoesScheduleHasVote doesScheduleHasVote;

  private VoteChain chain;

  @Override
  public void setNextChain(final VoteChain nextChain) {
    this.chain = nextChain;
  }

  @Override
  public void check(ValidVote vote) {
    if (this.doesScheduleHasVote.execute(vote.idSchedule(), vote.idAssociet())) {
      throw new AssocieteAlreadyVotedException();
    }
    chain.check(vote);
  }


}
