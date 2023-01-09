package br.com.bruno.system.controller.impl;

import br.com.bruno.system.controller.VoteController;
import br.com.bruno.system.controller.mapper.VoteMapper;
import br.com.bruno.system.controller.request.VoteRequest;
import br.com.bruno.system.controller.response.VoteResponse;
import br.com.bruno.system.controller.response.VoteResult;
import br.com.bruno.system.core.usecase.CreateVoteUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequiredArgsConstructor
public class VoteControllerImpl implements VoteController {

  private final CreateVoteUseCase createVoteUseCase;

  @Override
  public ResponseEntity<VoteResponse> vote(final VoteRequest request) {

    final var response = this.createVoteUseCase.insert(VoteMapper.INSTANCE.toVote(request));

    return ResponseEntity.ok().body(response);
  }

  @Override
  public ResponseEntity<VoteResponse> getallVotes() {
    return null;
  }

  @Override
  public ResponseEntity<VoteResult> getResult(final Long id) {
    return null;
  }


}
