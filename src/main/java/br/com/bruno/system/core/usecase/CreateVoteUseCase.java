package br.com.bruno.system.core.usecase;

import br.com.bruno.system.core.domain.Vote;

public interface CreateVoteUseCase {

  void insert(final Vote vote);

}
