// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code
		int lim = Integer.parseInt(args[0]);
		int a = (int)(Math.random() * (lim+1));
		int b = (int)(Math.random() * (lim+1));
		int c = (int)(Math.random() * (lim+1));
		boolean smallNum = a < b < c;
		int middleNum = Math.min(a,b);
		int bigNum = Math.min(a,b);

		System.out.println(a + " " + b + " " + c);
	}
}
