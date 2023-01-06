package br.com.bruno.system.dataprovider;

import br.com.bruno.system.core.dataprovider.FindAllSession;
import br.com.bruno.system.dataprovider.repository.VotingSessionRepository;
import br.com.bruno.system.dataprovider.repository.entity.VotingSessionEntity;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class FindAllSessionImpl implements FindAllSession {

  private final VotingSessionRepository sessionRepository;

  @Override
  public List<VotingSessionEntity> execute() {
    return sessionRepository.findAll();
  }


}
