package br.com.cod3r.estructural.mediator.translate.model;

import br.com.cod3r.estructural.mediator.translate.mediator.Mediator;

public class EnglishUser extends User {

	public EnglishUser(String name, Mediator mediator) {
		super(name, mediator, Language.ENGLISH);
	}
	
}
