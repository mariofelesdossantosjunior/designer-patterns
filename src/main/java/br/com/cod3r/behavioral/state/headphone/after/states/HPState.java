package br.com.cod3r.behavioral.state.headphone.after.states;

import br.com.cod3r.behavioral.state.headphone.after.HeadPhone;

public interface HPState {
	void click(HeadPhone hp);
	void longClick(HeadPhone hp);
}
