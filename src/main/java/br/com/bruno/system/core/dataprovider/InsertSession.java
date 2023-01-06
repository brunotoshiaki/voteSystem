package br.com.bruno.system.core.dataprovider;

import br.com.bruno.system.dataprovider.repository.entity.SessionEntity;

public interface InsertSession {

  SessionEntity execute(final SessionEntity session);
}
