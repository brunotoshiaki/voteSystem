package br.com.bruno.system.dataprovider;

import br.com.bruno.system.core.dataprovider.FindSessionByIdSchedule;
import br.com.bruno.system.dataprovider.repository.SessionRepository;
import br.com.bruno.system.dataprovider.repository.entity.SessionEntity;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class FindSessionByIdScheduleImpl implements FindSessionByIdSchedule {

  private final SessionRepository sessionRepository;

  @Override
  public Optional<SessionEntity> findByIdSchedule(Long id) {

    return sessionRepository.findSessionEntityByScheduleId(id);

  }
}
