package br.com.cod3r.estructural.bridge.backend.dao;

import br.com.cod3r.estructural.bridge.backend.model.User;

public class UserMysqlDao implements UserDao{

	@Override
	public void save(User user) {
		System.out.println("Saving the user in the Mysql Database!");
	}
}
