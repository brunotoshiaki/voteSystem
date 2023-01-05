package br.com.bruno.system.core.usecase.imp;

import br.com.bruno.system.core.dataprovider.FindByIdSchedule;
import br.com.bruno.system.core.dataprovider.FindSessionByIdSchedule;
import br.com.bruno.system.core.dataprovider.InsertSession;
import br.com.bruno.system.core.domain.VotingSession;
import br.com.bruno.system.core.usecase.CreateSessionUseCase;
import br.com.bruno.system.core.usecase.mapper.SessionResponseMapper;
import br.com.bruno.system.dataprovider.exception.ScheduleAlreadyCreatedExeption;
import br.com.bruno.system.dataprovider.repository.entity.VotingSessionEntity;
import br.com.bruno.system.entrypoint.controller.response.VotingSessionResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateSessionUseCaseImpl implements CreateSessionUseCase {

  private final InsertSession insertSession;
  private final FindByIdSchedule findByIdSchedule;

  private final FindSessionByIdSchedule findSessionByIdSchedule;


  @Override
  public VotingSessionResponse insert(final VotingSession session) {
    final var sessionEntity = this.createSessionEntity(session);
    final var result = this.insertSession.execute(sessionEntity);
    return SessionResponseMapper.INSTANCE.toSessionResponse(result);
  }

  private VotingSessionEntity createSessionEntity(final VotingSession session) {
    final var shedule = this.findByIdSchedule.findById(session.scheduleId());

    if (findSessionByIdSchedule.findByIdSchedule(shedule.getId()).isPresent()) {
      throw new ScheduleAlreadyCreatedExeption();
    }

    return new VotingSessionEntity(shedule, session.operatingTime());
  }
}
