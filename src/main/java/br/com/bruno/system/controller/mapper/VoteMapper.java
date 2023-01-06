package br.com.bruno.system.controller.mapper;

import br.com.bruno.system.controller.request.VoteRequest;
import br.com.bruno.system.core.domain.Vote;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface VoteMapper {

  VoteMapper INSTANCE = Mappers.getMapper(VoteMapper.class);


  Vote toVote(VoteRequest request);

}
