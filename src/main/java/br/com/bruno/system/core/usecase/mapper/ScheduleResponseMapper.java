package br.com.bruno.system.core.usecase.mapper;

import br.com.bruno.system.dataprovider.repository.entity.ScheduleEntity;
import br.com.bruno.system.entrypoint.controller.response.ScheduleResponse;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ScheduleResponseMapper {

  ScheduleResponseMapper INSTANCE = Mappers.getMapper(ScheduleResponseMapper.class);

  ScheduleResponse toScheduleResponse(final ScheduleEntity entity);

  List<ScheduleResponse> toSchedulesResponse(final List<ScheduleEntity> entities);
}
