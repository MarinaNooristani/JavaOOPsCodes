package com.syntax.class14;

public class Task1 {
	void checkUsernamePassword(String userName, String password, String confirmedPassword) {

		if (userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username and Password cannot be empty");
		} else {

			if (password.length() < 8) {
				System.out.println("Password is too short");
			} else {
				if (password.contains(userName)) {
					System.out.println("Password cannot contain username");
				} else {
					if (password.equals(confirmedPassword)) {
						System.out.println("Your username and password has been created");
					} else {
						System.out.println("Passwords do not match”");
					}
				}
			}

		}

	}

	public static void main(String[] args) {
		Task1 obj = new Task1();
		obj.checkUsernamePassword("Marina", "1234678$", "1234678$");

	}

}
