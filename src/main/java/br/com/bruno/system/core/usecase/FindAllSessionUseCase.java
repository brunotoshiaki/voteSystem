package br.com.bruno.system.core.usecase;

import br.com.bruno.system.entrypoint.controller.response.SessionResponse;
import java.util.List;

public interface FindAllSessionUseCase {

  List<SessionResponse> findAll();
}
