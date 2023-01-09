package br.com.bruno.system.dataprovider.impl;

import br.com.bruno.system.core.dataprovider.InsertVote;
import br.com.bruno.system.dataprovider.repository.VoteRepository;
import br.com.bruno.system.dataprovider.repository.entity.VoteEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InsertVoteImpl implements InsertVote {

  private final VoteRepository voteRepository;

  @Override
  public VoteEntity execute(final VoteEntity vote) {
    return this.voteRepository.save(vote);
  }
}
