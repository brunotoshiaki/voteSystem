package br.com.bruno.system.controller.impl;

import br.com.bruno.system.controller.ScheduleController;
import br.com.bruno.system.controller.mapper.ScheduleMapper;
import br.com.bruno.system.controller.request.ScheduleRequest;
import br.com.bruno.system.controller.response.ScheduleResponse;
import br.com.bruno.system.core.usecase.CreateScheduleUseCase;
import br.com.bruno.system.core.usecase.FindAllScheduleUseCase;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequiredArgsConstructor
public class ScheduleControllerImpl implements ScheduleController {

  private final CreateScheduleUseCase createScheduleUseCase;

  private final FindAllScheduleUseCase findAllScheduleUseCase;

  @Override
  public ResponseEntity<ScheduleResponse> create(final ScheduleRequest scheduleRequest) {
    final var response = this.createScheduleUseCase.insert(ScheduleMapper.INSTANCE.toSchedule(scheduleRequest));
    return ResponseEntity.ok().body(response);
  }

  @Override
  public ResponseEntity<List<ScheduleResponse>> findAll() {
    final var response = this.findAllScheduleUseCase.findAll();
    return ResponseEntity.ok().body(response);
  }
}
