package br.com.bruno.system.core.usecase;

import br.com.bruno.system.controller.response.SessionResponse;
import br.com.bruno.system.core.domain.Session;

public interface CreateSessionUseCase {

  SessionResponse insert(final Session session);
}
