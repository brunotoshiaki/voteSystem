package br.com.bruno.system.controller.mapper;

import br.com.bruno.system.controller.request.ScheduleRequest;
import br.com.bruno.system.core.domain.Schedule;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ScheduleMapper {

  ScheduleMapper INSTANCE = Mappers.getMapper(ScheduleMapper.class);

  Schedule toSchedule(final ScheduleRequest scheduleRequest);

}
