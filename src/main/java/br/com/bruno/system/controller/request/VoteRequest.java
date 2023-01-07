package br.com.bruno.system.controller.request;

import br.com.bruno.system.core.domain.VoteAnswerEnum;
import jakarta.validation.constraints.NotNull;


public record VoteRequest(@NotNull(message = msg) Long idAssociate,
                          @NotNull(message = msg) Long idSchedule,
                          @NotNull(message = msg) Long idSession,
                          VoteAnswerEnum vote) {

  private static final String msg = "All fields are required ";
}
