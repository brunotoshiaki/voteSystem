package br.com.bruno.system.dataprovider.repository.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity(name = "vote")
@Data
public class VoteEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "associateId", referencedColumnName = "id")
  private AssociateEntity associate;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "scheduleId", referencedColumnName = "id")
  private ScheduleEntity schedule;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "sessionId", referencedColumnName = "id")
  private VotingSessionEntity votingSession;

  private byte vote;

}
