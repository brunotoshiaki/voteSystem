package br.com.bruno.system.core.usecase.imp;

import br.com.bruno.system.controller.response.VoteResult;
import br.com.bruno.system.core.dataprovider.FindByIdSession;
import br.com.bruno.system.core.dataprovider.FindVoteBySession;
import br.com.bruno.system.core.usecase.SumVoteUseCase;
import br.com.bruno.system.dataprovider.repository.entity.VoteEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SumVoteUseCaseImpl implements SumVoteUseCase {

  private final FindVoteBySession findVoteBySession;

  private final FindByIdSession findByIdSession;


  @Override
  public VoteResult sum(final Long id) {
    this.findByIdSession.execute(id);
    final var vots = this.findVoteBySession.execute(id);

    final var total = vots.size();
    final var totalApproved = vots
        .stream()
        .filter(VoteEntity::isVote)
        .toList()
        .size();

    final var totalReproved = vots
        .stream()
        .filter(x -> !x.isVote())
        .toList()
        .size();

    return new VoteResult(total, totalApproved, totalReproved);
  }
}
