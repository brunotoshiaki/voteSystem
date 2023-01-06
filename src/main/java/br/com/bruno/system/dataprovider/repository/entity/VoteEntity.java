package br.com.bruno.system.dataprovider.repository.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "vote")
@NoArgsConstructor
@Data
public class VoteEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "idAssociate", referencedColumnName = "id")
  private AssociateEntity associate;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "idSchedule", referencedColumnName = "id")
  private ScheduleEntity schedule;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "idSession", referencedColumnName = "id")
  private SessionEntity session;
  private boolean vote;

  public VoteEntity(AssociateEntity associate, ScheduleEntity schedule, SessionEntity session, boolean vote) {
    this.associate = associate;
    this.schedule = schedule;
    this.session = session;
    this.vote = vote;
  }

}
