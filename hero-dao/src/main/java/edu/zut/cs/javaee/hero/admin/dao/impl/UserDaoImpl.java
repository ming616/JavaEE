package edu.zut.cs.javaee.hero.admin.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import edu.zut.cs.javaee.hero.admin.dao.UserDao;
import edu.zut.cs.javaee.hero.admin.domain.User;

@Component
public class UserDaoImpl implements UserDao{

	public List<User> findAll() {
		List<User> all =  new ArrayList<User>();
		for (int i = 0; i < 100; i++) {
			User u = new User();
			all.add(u);
		}
		return all;
	}

}
