package br.com.bruno.system.dataprovider.impl;

import br.com.bruno.system.core.dataprovider.FindByIdSchedule;
import br.com.bruno.system.dataprovider.exception.ObjectNotFoundException;
import br.com.bruno.system.dataprovider.repository.ScheduleRepository;
import br.com.bruno.system.dataprovider.repository.entity.ScheduleEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class FindByIdScheduleImpl implements FindByIdSchedule {

  private final ScheduleRepository scheduleRepository;

  @Override
  public ScheduleEntity execute(final Long id) {
    final var result = scheduleRepository.findById(id);
    return result.orElseThrow(() -> new ObjectNotFoundException("Schedule not find"));
  }
}
