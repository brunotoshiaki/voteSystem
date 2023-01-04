package br.com.bruno.system.entrypoint.controller;

import br.com.bruno.system.entrypoint.controller.request.ScheduleRequest;
import br.com.bruno.system.entrypoint.controller.response.ScheduleResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface ScheduleController {

  @PostMapping
  ResponseEntity<ScheduleResponse> create(@Valid @RequestBody final ScheduleRequest scheduleRequest);
}
