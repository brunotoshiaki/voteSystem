package br.com.bruno.system.dataprovider.repository.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;


@Getter
@Data
@Entity(name = "session")
public class VotingSessionEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "scheduleId", referencedColumnName = "id")
  private ScheduleEntity schedule;

  private int operatingTime;
  @CreationTimestamp
  private LocalDateTime creationTime;

  public VotingSessionEntity(ScheduleEntity schedule, int operatingTime) {
    this.schedule = schedule;
    this.operatingTime = operatingTime;
  }

  public VotingSessionEntity() {

  }
}
