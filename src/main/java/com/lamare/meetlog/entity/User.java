package com.lamare.meetlog.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The Class User.
 */
@Entity
@Table(name = "user")
public class User {
	
	/** The id. */
	@Id
	@GeneratedValue
	private int id;
	
	/** The pseudo. */
	private String pseudo;
	
	/** The password. */
	private String password;
	
	
	/** The mail. */
	private String mail;

	/**
	 * Instantiates a new user.
	 */
	public User(){
		super();
	}
	
	/**
	 * Instantiates a new user.
	 *
	 * @param id the id
	 * @param pseudo the pseudo
	 * @param password the password
	 * @param mail the mail
	 */
	public User(int id,String pseudo, String password,String mail){
		super();
		this.id = id;
		this.pseudo = pseudo;
		this.password = password;
		this.mail = mail;
	}
	
	/**
	 * Instantiates a new user.
	 *
	 * @param user the user
	 */
	public User(User user){
		super();
		this.id = user.getId();
		this.pseudo = user.getPseudo();
		this.password = user.getPassword();
		this.mail = user.getMail();
	}
	
	//Getters et Setters.
	
	/**
	 * Sets the mail.
	 *
	 * @param mail the new mail
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * Gets the mail.
	 *
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the pseudo.
	 *
	 * @return the pseudo
	 */
	public String getPseudo() {
		return pseudo;
	}

	/**
	 * Sets the pseudo.
	 *
	 * @param pseudo the new pseudo
	 */
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "User [id=" + this.id + ", pseudo=" + this.pseudo + ", password=" + this.password + ", super="+ super.toString() +"]";
	}
}
