package br.com.bruno.system.core.usecase.imp;

import br.com.bruno.system.core.dataprovider.InsertSchedule;
import br.com.bruno.system.core.domain.Schedule;
import br.com.bruno.system.core.usecase.CreateScheduleUseCase;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
public class CreateScheduleUseCaseImpl implements CreateScheduleUseCase {

  private final InsertSchedule insertSchedule;

  @Override
  public void insert(final Schedule schedule) {
    insertSchedule.insert(schedule);
  }
}
