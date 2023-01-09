package br.com.bruno.system.core.usecase;

import br.com.bruno.system.controller.response.VoteResult;

public interface SumVoteUseCase {

  VoteResult sum(final Long id);

}
