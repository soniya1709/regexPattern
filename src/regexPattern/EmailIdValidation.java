package regexPattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailIdValidation {
	public static void main(String[] args) {

		String str="soniya.sable1709@gmail.com";
		String ptr="^(.+)@(.+)$";
		Pattern pattern= Pattern.compile(ptr);
		Matcher matcher=pattern.matcher(str);
		if(matcher.matches()) {
			System.out.println("Valid Username");
		}
		else
		{
			System.out.println("Invalid Username");
		}
	}
}
