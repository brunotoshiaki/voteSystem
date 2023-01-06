package br.com.bruno.system.core.domain;

public record Vote(Long idAssociate, Long idSchedule, Long idSession, VoteAnswerEnum vote) {

}
