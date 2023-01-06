package br.com.bruno.system.core.usecase.imp;

import br.com.bruno.system.core.dataprovider.FindAllSession;
import br.com.bruno.system.core.usecase.FindAllSessionUseCase;
import br.com.bruno.system.core.usecase.mapper.SessionResponseMapper;
import br.com.bruno.system.entrypoint.controller.response.SessionResponse;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FindAllSessionUseCaseImpl implements FindAllSessionUseCase {

  private final FindAllSession findAllSession;

  @Override
  public List<SessionResponse> findAll() {
    final var response = this.findAllSession.execute();
    return SessionResponseMapper.INSTANCE.toSessionsResponse(response);
  }
}
