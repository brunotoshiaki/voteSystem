package br.com.bruno.system.dataprovider;

import br.com.bruno.system.core.dataprovider.InsertSession;
import br.com.bruno.system.dataprovider.repository.VotingSessionRepository;
import br.com.bruno.system.dataprovider.repository.entity.VotingSessionEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InsertSessionImpl implements InsertSession {

  private final VotingSessionRepository sessionRepository;


  @Override
  public VotingSessionEntity execute(final VotingSessionEntity session) {
    return this.sessionRepository.save(session);
  }
}
