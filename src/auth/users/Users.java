/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auth.users;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 *
 * @author oleksii
 */
public class Users {

	public static List<User> getUsers() {
		List<User> users = new ArrayList();
		users.add(new User("ADMIN", "ADMIN", Roles.ADMIN));
		users.add(new User("User1", "012345678", Roles.USER));
		users.add(new User("User2", "01234567", Roles.USER));
		users.add(new User("User3", "0123456!", Roles.USER));
		return users;
	}

	public static User getUserWithLoginAndPassword(String login, String password, boolean specialSymbols, boolean longPassword) {
		if (!login.equals("ADMIN") && ((longPassword && password.length() < 8) || (specialSymbols && !password.matches("[^A-Za-z0-9]+")))){
			return null;
		}
		
		User user = null;
		try {
			user = getUsers().stream().filter(u -> {
				return (u.getLogin().equals(login) && u.getPassword().equals(password));
			}).iterator().next();

		} catch (NoSuchElementException e) {
			System.err.println(login + " user not found");
		}
		return user;
	}

}
