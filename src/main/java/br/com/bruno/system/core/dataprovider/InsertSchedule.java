package br.com.bruno.system.core.dataprovider;

import br.com.bruno.system.core.domain.Schedule;
import br.com.bruno.system.dataprovider.repository.entity.ScheduleEntity;

public interface InsertSchedule {

  ScheduleEntity execute(final Schedule schedule);
}
