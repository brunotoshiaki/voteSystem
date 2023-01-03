package br.com.bruno.system.dataprovider.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity(name = "schedule")
@Data
public class ScheduleEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "associate_id", referencedColumnName = "id")
  private AssociateEntity associateEntity;

}
