package com.lamare.meetlog.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lamare.meetlog.entity.User;
import com.lamare.meetlog.service.UserService;

/**
 * The Class UserController.
 */
@Controller
public class UserController extends AbstractController{

	private static final Logger LOG = LoggerFactory.getLogger(UserController.class);

	/** The user service. */
	@Autowired
	private UserService userService;

	/**
	 * List users page.
	 *
	 * @return the model and view
	 */
	@RequestMapping(value = { "/", "welcome" }, method = RequestMethod.GET)
	public ModelAndView ListUsers() {
		ModelAndView modelAndView = createModelAndView("index", "Liste des utilisateurs");
		List<User> users = userService.getListAllUsers();
		modelAndView.addObject("users", users);

		return modelAndView;
	}

	/**
	 * About page.
	 *
	 * @return the model and view
	 */
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public ModelAndView about() {
		return createModelAndView("about","A Propos");
	}

	/**
	 * Login.
	 *
	 * @param error
	 *            the error
	 * @param logout
	 *            the logout
	 * @return the model and view
	 */
	@RequestMapping(value = "/login")
	public ModelAndView login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout, HttpServletRequest request) {
		ModelAndView modelAndView = createModelAndView("login","Connexion");
		LOG.debug("valeur error : " + error);
		if (null != error) {
			modelAndView.addObject("error", getErrorMessage(request, "SPRING_SECURITY_LAST_EXCEPTION"));
		}

		LOG.debug("valeur logout : " + logout);
		if (null != logout) {
			modelAndView.addObject("msg", "Vous êtes désormais déconnecté.");
		}
		testSession();
		return modelAndView;
	}

//	@RequestMapping(value = "/login", method = RequestMethod.POST)
//	public ModelAndView loginValidation(@RequestParam("pseudo") String pseudo,
//			@RequestParam("password") String password) {
//
//		ModelAndView modelAndView = createModelAndView("login","Connexion");
////		boolean loginSuccess = userService.login(pseudo, password);
////
////		if (loginSuccess) {
////
////		}
////		testSession();
//		return modelAndView;
//	}

	// customize the error message
	private String getErrorMessage(HttpServletRequest request, String key) {

		Exception exception = (Exception) request.getSession().getAttribute(key);

		String error = "";
		if (exception instanceof BadCredentialsException) {
			error = "Pseudo ou mot de passe invalide.";
		} else if (exception instanceof LockedException) {
			error = exception.getMessage();
		} else {
			error = "Pseudo ou mot de passe invalide.";
		}

		return error;
	}

	private void testSession() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (null != auth && !(auth instanceof AnonymousAuthenticationToken)) {
			UserDetails userDetail = (UserDetails) auth.getPrincipal();
			LOG.debug("WESHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
			LOG.debug(userDetail.toString());
			System.out.println(userDetail);

		}
	}
}