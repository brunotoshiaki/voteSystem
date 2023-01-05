package br.com.bruno.system.core.usecase;

import br.com.bruno.system.entrypoint.controller.response.ScheduleResponse;

public interface FindByIdScheduleUseCase {

  ScheduleResponse findById(final Long id);
}
