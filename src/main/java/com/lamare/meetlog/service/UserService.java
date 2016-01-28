package com.lamare.meetlog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.lamare.meetlog.dao.UserDao;
import com.lamare.meetlog.entity.User;

// TODO: Auto-generated Javadoc
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

	/**
	 * Login.
	 *
	 * @param pseudo
	 *            the pseudo
	 * @param password
	 *            the password
	 * @return true, if successful
	 */
	public boolean login(String pseudo, String password) throws UsernameNotFoundException {
		boolean response = false;
		User user = userDao.findUserByPseudo(pseudo.trim());
		if (null != pseudo && null != password) {
			if (user.getUsername().trim().equals(pseudo) && user.getPassword().equals(password)) {
				response = true;
			}
		}
		return response;
	}

	// Getters et Setters

	/**
	 * Gets the user dao.
	 *
	 * @return the user dao
	 */
	public UserDao getUserDao() {
		return userDao;
	}

	/**
	 * Sets the user dao.
	 *
	 * @param userDao
	 *            the new user dao
	 */
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
