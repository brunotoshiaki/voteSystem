package br.com.bruno.system.core.usecase;

import br.com.bruno.system.core.domain.Schedule;
import br.com.bruno.system.entrypoint.controller.response.ScheduleResponse;

public interface CreateScheduleUseCase {

  ScheduleResponse insert(final Schedule schedule);

}
