package br.com.bruno.system.dataprovider.repository.mapper;

import br.com.bruno.system.core.domain.Schedule;
import br.com.bruno.system.dataprovider.repository.entity.ScheduleEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper()
public interface ScheduleEntityMapper {

  ScheduleEntityMapper INSTANCE = Mappers.getMapper(ScheduleEntityMapper.class);

  @Mapping(target = "id", ignore = true)
  ScheduleEntity toScheduleEntity(final Schedule schedule);

}
