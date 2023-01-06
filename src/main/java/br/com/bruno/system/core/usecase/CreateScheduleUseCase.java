package br.com.bruno.system.core.usecase;

import br.com.bruno.system.controller.response.ScheduleResponse;
import br.com.bruno.system.core.domain.Schedule;

public interface CreateScheduleUseCase {

  ScheduleResponse insert(final Schedule schedule);

}
