package br.com.bruno.system.core.dataprovider;

import br.com.bruno.system.dataprovider.repository.entity.ScheduleEntity;

public interface FindByIdSchedule {

  ScheduleEntity findById(final Long id);
}
