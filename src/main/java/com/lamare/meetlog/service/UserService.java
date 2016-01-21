package com.lamare.meetlog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lamare.meetlog.dao.UserDao;
import com.lamare.meetlog.entity.User;

/**
 * The Class UserService.
 * 
 * @author Guillaume Lamare
 */
@Service
public class UserService {

	/** The user dao. */
	@Autowired
	private UserDao userDao;
	
	/**
	 * Gets the list all users.
	 *
	 * @return the list all users
	 */
	public List<User> getListAllUsers() {
		return userDao.findAll();
	}
	
}
