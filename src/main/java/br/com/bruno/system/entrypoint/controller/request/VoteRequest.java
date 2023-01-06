package br.com.bruno.system.entrypoint.controller.request;

import jakarta.validation.constraints.NotNull;

public record VoteRequest(@NotNull(message = msg) Long idAssociate,
                          @NotNull(message = msg) Long idSchedule,
                          @NotNull(message = msg) Long idSession,
                          VoteAnswerEnum vote) {

  private static final String msg = "All fields are required ";
}
