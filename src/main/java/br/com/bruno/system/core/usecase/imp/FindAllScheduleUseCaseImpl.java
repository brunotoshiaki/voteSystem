package br.com.bruno.system.core.usecase.imp;

import br.com.bruno.system.controller.response.ScheduleResponse;
import br.com.bruno.system.core.dataprovider.FindAllSchedule;
import br.com.bruno.system.core.usecase.FindAllScheduleUseCase;
import br.com.bruno.system.core.usecase.mapper.ScheduleResponseMapper;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FindAllScheduleUseCaseImpl implements FindAllScheduleUseCase {

  private final FindAllSchedule findAllSchedule;


  @Override
  public List<ScheduleResponse> findAll() {
    final var response = this.findAllSchedule.execute();
    return ScheduleResponseMapper.INSTANCE.toSchedulesResponse(response);
  }
}
