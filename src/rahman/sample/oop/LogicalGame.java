package rahman.sample.oop;

import java.util.Scanner;

public class LogicalGame {
	
	public void recursiveManual(int valueBawah, int valueAtas){
		System.out.print(valueBawah + " ");
		valueBawah++;
		if(valueBawah>=valueAtas+1)
			return;
		recursiveManual(valueBawah, valueAtas);	
	}

	public void reverseNumber(int input) {

		String output = "";
		String inputStr = Integer.toString(input);
		int lengthInput = (int) Math.log10(input) + 1;
		for (int i = lengthInput - 1; i >= 0; i--)
			output = output + inputStr.charAt(i);
		System.out.println(output);
	}

	//polindrome adalah nilai yang baca dari depan dan belakang sama
	protected void polindrome(String original) {
		String reverse = "";
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
//		System.out.println("Enter a string to check if it is a palindrome");
		// original = in.nextLine();

		int length = original.length();

		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);

		if (original.equals(reverse))
			System.out.println("Entered string "+original+"is a palindrome.");
		else
			System.out.println("Entered string "+original+" is not a palindrome.");
	}
}
