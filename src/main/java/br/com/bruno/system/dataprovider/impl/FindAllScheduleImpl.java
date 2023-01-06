package br.com.bruno.system.dataprovider.impl;

import br.com.bruno.system.core.dataprovider.FindAllSchedule;
import br.com.bruno.system.dataprovider.repository.ScheduleRepository;
import br.com.bruno.system.dataprovider.repository.entity.ScheduleEntity;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class FindAllScheduleImpl implements FindAllSchedule {

  private final ScheduleRepository scheduleRepository;

  @Override
  public List<ScheduleEntity> execute() {
    return scheduleRepository.findAll();
  }
}
