package br.com.cod3r.behavioral.chain.process.steps;

import br.com.cod3r.behavioral.chain.process.service.ProcessContext;

public class ValidateMandatoryField extends ProcessStep {

	public ValidateMandatoryField(Object... args) {
		super(args);
	}

	@Override
	public ProcessContext execute(ProcessContext context) throws Exception {
		Object field = context.get((String) args[0]);
		if(field == null) throw new Exception(String.format("%s is empty", args[0]));
		return next(context, true);
	}

}
