package br.com.bruno.system.core.usecase;

import br.com.bruno.system.entrypoint.controller.response.AssociateResponse;

public interface FindByIdAssociateUseCase {

  AssociateResponse findById(final Long id);
}
