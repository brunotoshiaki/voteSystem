package br.com.bruno.system.core.usecase.imp;

import br.com.bruno.system.controller.response.VoteResponse;
import br.com.bruno.system.core.dataprovider.FindAllVote;
import br.com.bruno.system.core.usecase.FindAllVoteUseCase;
import br.com.bruno.system.core.usecase.mapper.VoteResponseMapper;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FindAllVoteUseCaseImpl implements FindAllVoteUseCase {

  private final FindAllVote findAllVote;

  @Override
  public List<VoteResponse> findAll() {
    final var result = findAllVote.execute();
    return VoteResponseMapper.toVotesResponse(result);
  }
}
