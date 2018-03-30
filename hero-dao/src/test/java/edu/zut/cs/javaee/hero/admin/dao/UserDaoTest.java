package edu.zut.cs.javaee.hero.admin.dao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.zut.cs.javaee.hero.admin.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AdminDaoConfig.class)
public class UserDaoTest {

	@Autowired
	UserDao userDao;

	@Test
	public void testFindAll() {
		List<User> all = this.userDao.findAll();
		List<User> expected = new ArrayList<User>();
		for (int i = 0; i < 100; i++) {
			User u = new User();
			expected.add(u);
		}
		assertEquals(expected.size(), all.size());
	}

}
