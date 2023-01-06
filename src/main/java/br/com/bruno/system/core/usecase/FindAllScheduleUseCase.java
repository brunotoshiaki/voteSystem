package br.com.bruno.system.core.usecase;

import br.com.bruno.system.controller.response.ScheduleResponse;
import java.util.List;

public interface FindAllScheduleUseCase {

  List<ScheduleResponse> findAll();
}
