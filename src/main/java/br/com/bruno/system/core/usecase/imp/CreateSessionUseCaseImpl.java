package br.com.bruno.system.core.usecase.imp;

import br.com.bruno.system.controller.response.SessionResponse;
import br.com.bruno.system.core.dataprovider.DoesSessionHasSchedule;
import br.com.bruno.system.core.dataprovider.FindByIdSchedule;
import br.com.bruno.system.core.dataprovider.InsertSession;
import br.com.bruno.system.core.domain.Session;
import br.com.bruno.system.core.usecase.CreateSessionUseCase;
import br.com.bruno.system.core.usecase.mapper.SessionResponseMapper;
import br.com.bruno.system.dataprovider.exception.ScheduleAlreadyCreatedExeption;
import br.com.bruno.system.dataprovider.repository.entity.SessionEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateSessionUseCaseImpl implements CreateSessionUseCase {

  private final InsertSession insertSession;
  private final FindByIdSchedule findByIdSchedule;

  private final DoesSessionHasSchedule doesSessionHasSchedule;


  @Override
  public SessionResponse insert(final Session session) {
    final var sessionEntity = this.createSessionEntity(session);
    final var result = this.insertSession.execute(sessionEntity);
    return SessionResponseMapper.INSTANCE.toSessionResponse(result);
  }

  private SessionEntity createSessionEntity(final Session session) {
    final var shedule = this.findByIdSchedule.execute(session.scheduleId());

    if (doesSessionHasSchedule.execute(session.scheduleId())) {
      throw new ScheduleAlreadyCreatedExeption();
    }

    return new SessionEntity(shedule, session.operatingTime());
  }
}
