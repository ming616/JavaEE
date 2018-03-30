package edu.zut.cs.javaee.hero.admin.dao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import edu.zut.cs.javaee.hero.admin.domain.User;

public class UserDaoTest {
	
	UserDao userDao;

	@Test
	public void testFindAll() {
		List<User> all = this.userDao.findAll();
		List<User> expected = new ArrayList<User>();
		for ( int i =0;i<100;i++)
		{
			User u = new User();
			expected.add(u);
		}
		assertEquals(expected,all);
	}

}
