package br.com.bruno.system.entrypoint.controller.mapper;

import br.com.bruno.system.core.domain.Schedule;
import br.com.bruno.system.entrypoint.controller.request.ScheduleRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ScheduleMapper {

  ScheduleMapper INSTANCE = Mappers.getMapper(ScheduleMapper.class);

  Schedule toSchedule(final ScheduleRequest scheduleRequest);

}
