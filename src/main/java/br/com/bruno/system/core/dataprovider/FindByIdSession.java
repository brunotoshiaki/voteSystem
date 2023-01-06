package br.com.bruno.system.core.dataprovider;

import br.com.bruno.system.dataprovider.repository.entity.SessionEntity;

public interface FindByIdSession {

  SessionEntity execute(final Long id);
}
