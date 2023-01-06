package br.com.bruno.system.dataprovider;

import br.com.bruno.system.core.dataprovider.InsertSession;
import br.com.bruno.system.dataprovider.repository.SessionRepository;
import br.com.bruno.system.dataprovider.repository.entity.SessionEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InsertSessionImpl implements InsertSession {

  private final SessionRepository sessionRepository;


  @Override
  public SessionEntity execute(final SessionEntity session) {
    return this.sessionRepository.save(session);
  }
}
