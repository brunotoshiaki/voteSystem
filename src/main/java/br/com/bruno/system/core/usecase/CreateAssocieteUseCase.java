package br.com.bruno.system.core.usecase;

import br.com.bruno.system.core.domain.Associate;
import br.com.bruno.system.entrypoint.controller.response.AssociateResponse;

public interface CreateAssocieteUseCase {

  AssociateResponse insert(final Associate associate);
}
