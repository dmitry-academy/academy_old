package by.academy.lesson7.classwork.task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements Validator {

	private Pattern p = Pattern.compile("^[A-Z0-9a-z._%+-]+@[A-Za-z0-9\\.-]+\\.[A-Za-z]{2,64}$");

	@Override
	public boolean validate(String vString) {
		Matcher m = p.matcher(vString);
		return m.find();
	}

}
