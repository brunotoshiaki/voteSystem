package br.com.bruno.system.controller.impl;

import br.com.bruno.system.controller.VoteController;
import br.com.bruno.system.controller.mapper.VoteMapper;
import br.com.bruno.system.controller.request.VoteRequest;
import br.com.bruno.system.controller.response.VoteResponse;
import br.com.bruno.system.controller.response.VoteResult;
import br.com.bruno.system.core.usecase.CreateVoteUseCase;
import br.com.bruno.system.core.usecase.FindAllVoteUseCase;
import br.com.bruno.system.core.usecase.SumVoteUseCase;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequiredArgsConstructor
public class VoteControllerImpl implements VoteController {

  private final CreateVoteUseCase createVoteUseCase;
  private final FindAllVoteUseCase findAllVoteUseCase;

  private final SumVoteUseCase sumVoteUseCase;


  @Override
  public ResponseEntity<VoteResponse> vote(final VoteRequest request) {
    final var response = this.createVoteUseCase.insert(VoteMapper.INSTANCE.toVote(request));
    return ResponseEntity.ok().body(response);
  }

  @Override
  public ResponseEntity<List<VoteResponse>> findAll() {
    final var response = this.findAllVoteUseCase.findAll();
    return ResponseEntity.ok().body(response);
  }

  @Override
  public ResponseEntity<VoteResult> getResult(final Long id) {
    final var response = this.sumVoteUseCase.sum(id);
    return ResponseEntity.ok().body(response);
  }


}
