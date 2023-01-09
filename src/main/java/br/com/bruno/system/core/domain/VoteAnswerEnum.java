package br.com.bruno.system.core.domain;

import java.util.EnumSet;
import lombok.Getter;

@Getter
public enum VoteAnswerEnum {
  SIM(Boolean.TRUE), NAO(Boolean.FALSE);

  private final Boolean vote;


  VoteAnswerEnum(Boolean vote) {
    this.vote = vote;
  }


  public static VoteAnswerEnum getEnum(boolean code) {

    return EnumSet.allOf(VoteAnswerEnum.class)
        .stream()
        .filter(e -> e.vote.equals(code))
        .findAny()
        .orElseThrow(IllegalStateException::new);

  }

}
