package br.com.bruno.system.entrypoint.controller.request;

import jakarta.validation.constraints.NotNull;

public record VotingSessionRequest(@NotNull(message = "The scheduleId is required") Long scheduleId, int operatingTime) {

  public VotingSessionRequest(Long scheduleId) {
    this(scheduleId, 10);
  }
}
