// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		if (args[0].length() < 4){	
			// name the args:
			int number = Integer.parseInt(args[0]);
			// calculating the hundreds, tens and ones by calculating the remainder when dividing by 10.
			//
			int hundreds = (number / 100) % 10;
			int tens = (number / 10) % 10;
			int ones = number % 10;
			System.out.println(hundreds + " hundreds, " + tens + 
			" tens, and " + ones + " ones.");
		}
		else {
			// if the number has more then 3 digits:
			String number = args[0];
			// we use the The charAt() method to returns the character at the specified index in a string.
			// we use the length() method to get the string's length. 
			// also we subtract the length number so we can get the hundreds, tens and ones place:
			char hundreds = number.charAt(number.length()-3);
			char tens = number.charAt(number.length()-2);
			char ones = number.charAt(number.length()-1);
			System.out.println(hundreds + " hundreds, " + tens + 
			" tens, and " + ones + " ones.");
		}
		

	}
}
