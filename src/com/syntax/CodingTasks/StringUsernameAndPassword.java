package com.syntax.CodingTasks;

import java.util.Scanner;

public class StringUsernameAndPassword {

	public static void main(String[] args) {

		/*
		 * Store username, password and confirm password from a user and check following
		 * requirements: Username and Password cannot be empty, if so→ message=”Username
		 * and Password cannot be empty”. Password should be minimum 8 characters, if
		 * less → message=”Password is too short”. Password cannot contain username if
		 * so, → message=”Password cannot contain username”. Password should match
		 * confirmed password, if not → message=“Passwords do not match”. Only after all
		 * requirements met → message “Your username and password has been created”
		 */

		Scanner info = new Scanner(System.in);
		System.out.println("User name: ");
		String username = info.nextLine();
		System.out.println("Password: ");
		String password = info.nextLine();
		System.out.println("Confirm Password:");
		String confirmpassword = info.nextLine();

		if (username.isEmpty() || password.isEmpty()) {
			System.out.println("Username and Password cannot be empty.");
		}

		else if (password.length() < 8) {
			System.out.println("Password is too short.");
		}

		else if (password.equals(username)) {
			System.out.println("Password cannot contain Username.");
		}

		else if (!password.equals(confirmpassword)) {
			System.out.println("Password do not match.");
		} else {
			System.out.println("Your user name and password has been created");
		}

		info.close();

	}
}
