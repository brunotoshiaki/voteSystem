package br.com.bruno.system.dataprovider.repository;

import br.com.bruno.system.dataprovider.repository.entity.ScheduleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<ScheduleEntity, Long> {

}
