package br.com.bruno.system.core.dataprovider;

import br.com.bruno.system.dataprovider.repository.entity.ScheduleEntity;

public interface FindByIdSchedule {

  ScheduleEntity execute(final Long id);
}
