package br.com.cod3r.estructural.mediator.translate.model;

import br.com.cod3r.estructural.mediator.translate.mediator.Mediator;

public final class PortugueseUser extends User {

	public PortugueseUser(String name, Mediator mediator) {
		super(name, mediator, Language.PORTUGUESE);
	}
	
}
