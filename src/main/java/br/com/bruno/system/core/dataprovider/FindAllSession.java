package br.com.bruno.system.core.dataprovider;

import br.com.bruno.system.dataprovider.repository.entity.VotingSessionEntity;
import java.util.List;

public interface FindAllSession {

  List<VotingSessionEntity> execute();
}
