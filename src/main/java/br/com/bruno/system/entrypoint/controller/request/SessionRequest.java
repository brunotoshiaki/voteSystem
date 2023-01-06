package br.com.bruno.system.entrypoint.controller.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class SessionRequest {

  @NotNull(message = "The scheduleId is required")
  private Long scheduleId;
  private int operatingTime = 1;

}
