package edu.zut.cs.javaee.hero.admin.dao;

import java.util.List;

import edu.zut.cs.javaee.hero.admin.domain.User;

public interface UserDao {

		List<User> findAll();
}
