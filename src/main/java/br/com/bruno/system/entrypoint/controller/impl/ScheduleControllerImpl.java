package br.com.bruno.system.entrypoint.controller.impl;

import br.com.bruno.system.core.usecase.CreateScheduleUseCase;
import br.com.bruno.system.entrypoint.controller.ScheduleController;
import br.com.bruno.system.entrypoint.controller.mapper.ScheduleMapper;
import br.com.bruno.system.entrypoint.controller.request.ScheduleRequest;
import br.com.bruno.system.entrypoint.controller.response.ScheduleResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value = "/api/v1/schedule")
@RequiredArgsConstructor
public class ScheduleControllerImpl implements ScheduleController {

  private final CreateScheduleUseCase createScheduleUseCase;

  @Override
  public ResponseEntity<ScheduleResponse> create(final ScheduleRequest scheduleRequest) {
    final var response = this.createScheduleUseCase.insert(ScheduleMapper.INSTANCE.toSchedule(scheduleRequest));
    return ResponseEntity.ok().body(response);
  }
}
