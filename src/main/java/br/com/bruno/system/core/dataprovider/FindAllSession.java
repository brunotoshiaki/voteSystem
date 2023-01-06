package br.com.bruno.system.core.dataprovider;

import br.com.bruno.system.dataprovider.repository.entity.SessionEntity;
import java.util.List;

public interface FindAllSession {

  List<SessionEntity> execute();
}
