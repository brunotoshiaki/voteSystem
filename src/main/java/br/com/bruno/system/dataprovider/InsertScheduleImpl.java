package br.com.bruno.system.dataprovider;

import br.com.bruno.system.core.dataprovider.InsertSchedule;
import br.com.bruno.system.core.domain.Schedule;
import br.com.bruno.system.dataprovider.repository.ScheduleRepository;
import br.com.bruno.system.dataprovider.repository.mapper.ScheduleEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InsertScheduleImpl implements InsertSchedule {

  private final ScheduleRepository scheduleRepository;


  @Override
  public void insert(final Schedule schedule) {
    var sheduleEntity = ScheduleEntityMapper.INSTANCE.toScheduleEntity(schedule);
    scheduleRepository.save(sheduleEntity);
  }
}