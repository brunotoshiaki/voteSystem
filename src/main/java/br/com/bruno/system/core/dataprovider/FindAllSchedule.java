package br.com.bruno.system.core.dataprovider;

import br.com.bruno.system.dataprovider.repository.entity.ScheduleEntity;
import java.util.List;

public interface FindAllSchedule {

  List<ScheduleEntity> execute();
}
