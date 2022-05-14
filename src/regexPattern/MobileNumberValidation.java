package regexPattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberValidation {
public static void main(String[] args) {
	String str="9427357373";
	String pat="^[9][0-9]{9}";
	Pattern pattern = Pattern.compile(pat);
	Matcher matcher=pattern.matcher(str);
	if(matcher.matches())
	{
		System.out.println("mobile number is valid");
		
	}
	else
	{
		System.out.println("Not valid");
	}
}
}
