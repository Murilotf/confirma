package br.com.confirma.dao;

import javax.ejb.Local;

import br.com.confirma.User;
import br.com.confirma.dao.common.Dao;

@Local
public interface UserDao extends Dao<User> {

	User findByUsername(String username);

}
