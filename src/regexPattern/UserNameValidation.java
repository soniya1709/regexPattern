package regexPattern;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserNameValidation {
	public static void main(String[] args) {

		String str="Soniya.Sable1709";
		String ptr="^[a-zA-Z0-9.]{8,29}";
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
