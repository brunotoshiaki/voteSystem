package br.com.bruno.system.controller.response;

import br.com.bruno.system.core.domain.VoteAnswerEnum;

public record VoteResponse(Long id, Long idSchedule, Long idSession, VoteAnswerEnum answerEnum) {

}
