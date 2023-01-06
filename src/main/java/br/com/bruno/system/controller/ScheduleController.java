package br.com.bruno.system.controller;

import br.com.bruno.system.controller.request.ScheduleRequest;
import br.com.bruno.system.controller.response.ScheduleResponse;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/api/v1/schedule")
public interface ScheduleController {

  @PostMapping
  ResponseEntity<ScheduleResponse> create(@Valid @RequestBody final ScheduleRequest scheduleRequest);

  @GetMapping
  ResponseEntity<List<ScheduleResponse>> findAll();
}
