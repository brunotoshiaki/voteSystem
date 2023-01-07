package br.com.bruno.system.core.domain;

import java.time.LocalDateTime;


public record ValidVote(Long idAssociet, Long idSchedule, LocalDateTime timeNow, LocalDateTime creationTime, int operatingTime) {

}
