package br.com.bruno.system.core.usecase.mapper;

import br.com.bruno.system.controller.response.VoteResponse;
import br.com.bruno.system.core.domain.VoteAnswerEnum;
import br.com.bruno.system.dataprovider.repository.entity.VoteEntity;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class VoteResponseMapper {


  public static VoteResponse toVoteResponse(final VoteEntity entity) {
    return new VoteResponse(entity.getId(),
        entity.getSchedule().getId(),
        entity.getSession().getId(),
        VoteAnswerEnum.getEnum(entity.isVote()));

  }

}
