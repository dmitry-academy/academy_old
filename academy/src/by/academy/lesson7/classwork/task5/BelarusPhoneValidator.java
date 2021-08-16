package by.academy.lesson7.classwork.task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator {
	private Pattern p = Pattern.compile("^\\+37529[\\d]{7}$");

	@Override
	public boolean validate(String vString) {
		Matcher m = p.matcher(vString);
		return m.find();
	}
}
