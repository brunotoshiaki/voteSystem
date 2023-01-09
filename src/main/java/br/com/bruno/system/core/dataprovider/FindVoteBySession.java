package br.com.bruno.system.core.dataprovider;

import br.com.bruno.system.dataprovider.repository.entity.VoteEntity;
import java.util.List;

public interface FindVoteBySession {

  List<VoteEntity> execute(Long id);
}
