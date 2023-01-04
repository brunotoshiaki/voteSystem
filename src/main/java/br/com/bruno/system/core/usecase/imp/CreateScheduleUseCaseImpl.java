package br.com.bruno.system.core.usecase.imp;

import br.com.bruno.system.core.dataprovider.InsertSchedule;
import br.com.bruno.system.core.domain.Schedule;
import br.com.bruno.system.core.usecase.CreateScheduleUseCase;
import br.com.bruno.system.dataprovider.mapper.ScheduleResponseMapper;
import br.com.bruno.system.entrypoint.controller.response.ScheduleResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateScheduleUseCaseImpl implements CreateScheduleUseCase {

  private final InsertSchedule insertSchedule;

  @Override
  public ScheduleResponse insert(final Schedule schedule) {
    final var response = this.insertSchedule.execute(schedule);
    return ScheduleResponseMapper.INSTANCE.toScheduleResponse(response);
  }
}
