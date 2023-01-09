package br.com.bruno.system.core.usecase;

import br.com.bruno.system.controller.response.VoteResponse;
import java.util.List;

public interface FindAllVoteUseCase {

  List<VoteResponse> findAll();

}
