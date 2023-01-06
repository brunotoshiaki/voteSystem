package br.com.bruno.system.dataprovider;

import br.com.bruno.system.core.dataprovider.FindAllSession;
import br.com.bruno.system.dataprovider.repository.SessionRepository;
import br.com.bruno.system.dataprovider.repository.entity.SessionEntity;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class FindAllSessionImpl implements FindAllSession {

  private final SessionRepository sessionRepository;

  @Override
  public List<SessionEntity> execute() {
    return sessionRepository.findAll();
  }


}
