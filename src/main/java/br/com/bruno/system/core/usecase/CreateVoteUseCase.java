package br.com.bruno.system.core.usecase;

import br.com.bruno.system.controller.response.VoteResponse;
import br.com.bruno.system.core.domain.Vote;

public interface CreateVoteUseCase {

  VoteResponse insert(final Vote vote);

}
