package com.lamare.meetlog.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lamare.meetlog.entity.User;

@Repository
@SuppressWarnings({ "unchecked"})
public class UserDao {

	/** The session factory. */
	@Autowired
	private SessionFactory sessionFactory;
	
//	private static final Logger LOG = LoggerFactory.getLogger(UserDao.class);

	@Transactional
	public List<User> findAll() {
		Session session = sessionFactory.getCurrentSession();
		List<User> users = (List<User>) session.createQuery("FROM User").list();
		return users;
	}
}
