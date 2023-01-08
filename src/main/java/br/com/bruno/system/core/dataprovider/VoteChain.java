package br.com.bruno.system.core.dataprovider;

import br.com.bruno.system.core.domain.ValidVote;


public interface VoteChain {

  default void setNextChain(final VoteChain nextChain) {
  }

  void check(ValidVote vote);


}
