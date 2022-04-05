package com.syntax.class13;

public class MethodHW4 {
	// 4.Create a method createEmail(). Based on values of users name, lastName and
	// email type, your method should return complete email Address.
	//
	String createEmail(String userName, String lastName, String emailType) {
		return userName.toLowerCase() + lastName.toLowerCase() + "@" + emailType + ".com";
	}

	public static void main(String[] args) {
		MethodHW4 user1 = new MethodHW4();
		System.out.println(user1.createEmail("John", "Snow", "gmail"));

	}

}
