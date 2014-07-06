package rahman.sample.oop;

public class SampleOOP {

	public static void main(String[] args) {
		// Convert Integer to RomanNumber
		ConvertRomanNumber roman = new ConvertRomanNumber();
		int input=501;
		System.out.println(input + " --> "+ roman.RomanNumerals(input));
		
		LogicalGame logicGame = new LogicalGame();
		logicGame.reverseNumber(12930);
		
		logicGame.polindrome("bohoohob");
		
		logicGame.recursiveManual(1,20);
	}
	
	

}
