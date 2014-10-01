package rahman.sample.detectCharacter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "This is the text to be searched " + "for occurrences of the http:// pattern."; 
		String patternString = ".*/.*";
		Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE); 
		Matcher matcher = pattern.matcher(text);
		boolean matches = matcher.matches(); 
		System.out.println("matches = " + matches);
	}

}
