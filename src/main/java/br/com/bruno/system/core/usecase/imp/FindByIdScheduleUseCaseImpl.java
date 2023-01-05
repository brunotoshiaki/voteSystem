package br.com.bruno.system.core.usecase.imp;

import br.com.bruno.system.core.dataprovider.FindByIdSchedule;
import br.com.bruno.system.core.usecase.FindByIdScheduleUseCase;
import br.com.bruno.system.core.usecase.mapper.ScheduleResponseMapper;
import br.com.bruno.system.entrypoint.controller.response.ScheduleResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FindByIdScheduleUseCaseImpl implements FindByIdScheduleUseCase {

  private final FindByIdSchedule findByIdSchedule;


  @Override
  public ScheduleResponse findById(final Long id) {
    final var result = this.findByIdSchedule.findById(id);
    return ScheduleResponseMapper.INSTANCE.toScheduleResponse(result);

  }
}
