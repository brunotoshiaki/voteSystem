package br.com.bruno.system.core.usecase;

import br.com.bruno.system.core.domain.VotingSession;
import br.com.bruno.system.entrypoint.controller.response.VotingSessionResponse;

public interface CreateSessionUseCase {

  VotingSessionResponse insert(final VotingSession session);
}
