package br.com.bruno.system.core.usecase;

import br.com.bruno.system.core.domain.Session;
import br.com.bruno.system.entrypoint.controller.response.SessionResponse;

public interface CreateSessionUseCase {

  SessionResponse insert(final Session session);
}
