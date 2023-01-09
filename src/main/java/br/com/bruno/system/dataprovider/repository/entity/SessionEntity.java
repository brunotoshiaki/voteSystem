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
import org.hibernate.annotations.CreationTimestamp;


@Data
@Entity(name = "session")
public class SessionEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "idSchedule", referencedColumnName = "id")
  private ScheduleEntity schedule;
  private int operatingTime;
  @CreationTimestamp
  private LocalDateTime creationTime;


  public SessionEntity(final int operatingTime, final LocalDateTime creationTime) {
    this.operatingTime = operatingTime;
    this.creationTime = creationTime;
  }


  public SessionEntity() {

  }

  public SessionEntity(final ScheduleEntity schedule, final int operatingTime) {
    this.schedule = schedule;
    this.operatingTime = operatingTime;
  }

}
