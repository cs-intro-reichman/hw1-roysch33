// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
			// name the args:
			int number = Integer.parseInt(args[0]);
			// calculating the hundreds, tens and ones by calculating the remainder when dividing by 10.
			int ones = number % 10;
			int tens = (number / 10) % 10;
			// setting up an if-else conditions so we can handle the hundreds number if the input number has more then 3 digits.
			if (args[0].length() < 4){
				int hundreds = (number / 100) % 100;
				System.out.println(hundreds + " hundreds, " + tens + 
				" tens, and " + ones + " ones.");
				}
			else {
				int hundreds = (number / 100) % ((int)Math.pow(10, args[0].length()-2)); 
				System.out.println(hundreds + " hundreds, " + tens + 
				" tens, and " + ones + " ones.");
				}

	}
}
