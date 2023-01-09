package br.com.bruno.system.dataprovider.impl;

import br.com.bruno.system.core.dataprovider.FindAllVote;
import br.com.bruno.system.dataprovider.repository.VoteRepository;
import br.com.bruno.system.dataprovider.repository.entity.VoteEntity;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class FindAllVoteImpl implements FindAllVote {

  private final VoteRepository voteRepository;


  @Override
  public List<VoteEntity> execute() {
    return this.voteRepository.findAll();
  }
}
