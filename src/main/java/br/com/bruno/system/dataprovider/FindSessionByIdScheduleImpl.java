package br.com.bruno.system.dataprovider;

import br.com.bruno.system.core.dataprovider.FindSessionByIdSchedule;
import br.com.bruno.system.dataprovider.repository.VotingSessionRepository;
import br.com.bruno.system.dataprovider.repository.entity.VotingSessionEntity;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class FindSessionByIdScheduleImpl implements FindSessionByIdSchedule {

  private final VotingSessionRepository sessionRepository;

  @Override
  public Optional<VotingSessionEntity> findByIdSchedule(Long id) {

    return sessionRepository.findVotingSessionEntityByScheduleId(id);

  }
}
