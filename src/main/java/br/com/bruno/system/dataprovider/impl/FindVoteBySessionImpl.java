package br.com.bruno.system.dataprovider.impl;

import br.com.bruno.system.core.dataprovider.FindVoteBySession;
import br.com.bruno.system.dataprovider.repository.VoteRepository;
import br.com.bruno.system.dataprovider.repository.entity.VoteEntity;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class FindVoteBySessionImpl implements FindVoteBySession {

  private final VoteRepository voteRepository;

  @Override
  public List<VoteEntity> execute(Long id) {
    return voteRepository.findVoteEntityBySessionId(id);
  }
}
