package br.com.bruno.system.core.dataprovider;

import br.com.bruno.system.dataprovider.repository.entity.VoteEntity;

public interface InsertVote {

  VoteEntity execute(VoteEntity vote);
}
