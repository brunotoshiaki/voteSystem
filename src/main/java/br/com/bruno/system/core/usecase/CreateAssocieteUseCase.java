package br.com.bruno.system.core.usecase;

import br.com.bruno.system.controller.response.AssociateResponse;
import br.com.bruno.system.core.domain.Associate;

public interface CreateAssocieteUseCase {

  AssociateResponse insert(final Associate associate);
}
