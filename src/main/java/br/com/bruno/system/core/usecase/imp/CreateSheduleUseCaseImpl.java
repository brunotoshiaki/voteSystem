package br.com.bruno.system.core.usecase.imp;

import br.com.bruno.system.core.dataprovider.InsertShedule;
import br.com.bruno.system.core.domain.Schedule;
import br.com.bruno.system.core.usecase.CreateScheduleUseCase;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateSheduleUseCaseImpl implements CreateScheduleUseCase {

  private final InsertShedule insertShedule;

  @Override
  public void insert(final Schedule schedule) {
    insertShedule.insert(schedule);
  }
}
