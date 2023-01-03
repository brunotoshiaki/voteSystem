package br.com.bruno.system.dataprovider.repository;

import br.com.bruno.system.dataprovider.repository.entity.ScheduleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

interface ScheduleRepository extends JpaRepository<Long, ScheduleEntity> {

}
