package by.academy.lesson7.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserNameCheck {

	public static void main(String[] args) {
		System.out.println("Cool check:");

		System.out.println(checkWithRegExp("_@BEST"));
		System.out.println(checkWithRegExp("vovan"));
		System.out.println(checkWithRegExp("vo"));
		System.out.println(checkWithRegExp("Z@OZA"));

		System.out.println("\nDumb check:");

		System.out.println(dumbCheck("_@BEST"));
		System.out.println(dumbCheck("vovan"));
		System.out.println(dumbCheck("vo"));
		System.out.println(dumbCheck("Z@OZA"));
	}

	public static boolean checkWithRegExp(String userNameString) {
		Pattern p = Pattern.compile("^[a-z0-9_-]{3,15}$");
		Matcher m = p.matcher(userNameString);
		return m.matches();
	}

	public static boolean dumbCheck(String userNameString) {

		char[] symbols = userNameString.toCharArray();
		if (symbols.length < 3 || symbols.length > 15)
			return false;

		String validationString = "abcdefghijklmnopqrstuvwxyz0123456789_";
 
		for (char c : symbols) {
			if (validationString.indexOf(c) == -1)
				return false;
		}

		return true;
	}
}