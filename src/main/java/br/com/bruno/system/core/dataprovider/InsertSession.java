package br.com.bruno.system.core.dataprovider;

import br.com.bruno.system.dataprovider.repository.entity.VotingSessionEntity;

public interface InsertSession {

  VotingSessionEntity execute(final VotingSessionEntity session);
}
