package rahman.sample.oop;

import java.text.NumberFormat;
import java.util.Locale;

public class SampleOOP {

	public static void main(String[] args) {
		//Convert Integer To Word Numbering
		System.out.println("=============Convert Number to word========");
		ConvertNumberToWord numToWord = new ConvertNumberToWord();
		int inputNumberToWord = 982723341;
		
		//get USD Currency Format
		//NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println( convertNumberToRupiahFormat(inputNumberToWord) + " = " + numToWord.convertNumberToWord(inputNumberToWord));
		
		// Convert Integer to RomanNumber
		System.out.println("\n\n=============Convert Number Roman Numbering========");
		ConvertNumberToRoman roman = new ConvertNumberToRoman();
		int input=511;
		System.out.println(input + " --> "+ roman.RomanNumerals(input));
		
		
		System.out.println("\n\n=============Reverse Number and Polindrome========");
		LogicalGame logicGame = new LogicalGame();
		//===========Reverse Number=========================
		logicGame.reverseNumber(12930);
		
		//===========Detect Polindrome======================
		logicGame.polindrome("bohoohob");
		
		//=============get Recursive Manual=================
		logicGame.recursiveManual(1,4);
		System.out.println("\n ========");
		
		//===============Drawing Triangle Number============
		logicGame.getStarTriangle(4);
		
	}
	
	
	
	
	
	
	public static String convertNumberToRupiahFormat(int nominal){
		Locale locale = new Locale("ca", "CA");
//		Locale locale = new Locale("rp", "RP");
		NumberFormat rupiahFormat = NumberFormat.getCurrencyInstance(locale);
		String rupiah = rupiahFormat.format(Double.parseDouble(String.valueOf(nominal))).substring(4);
		
		return "Rp "+rupiah;
	}

}
