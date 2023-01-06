package br.com.bruno.system.entrypoint.controller.request;

import lombok.Getter;

@Getter
public enum VoteAnswerEnum {
  SIM(Boolean.TRUE), NAO(Boolean.FALSE);

  private final Boolean vote;


  VoteAnswerEnum(Boolean vote) {
    this.vote = vote;
  }
}
