// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// naming the args:
		int lim = Integer.parseInt(args[0]);
		// setting a random using the Math.random() commend and setting it to lim+1 range so we can get all the numbers from 0 to lim.
		int a = (int)(Math.random() * (lim+1));
		int b = (int)(Math.random() * (lim+1));
		int c = (int)(Math.random() * (lim+1));
		//getting the smallest number by using the Math.min() command.
		int smallNum = Math.min(a,b);
		int smallestNum = Math.min(smallNum,c);
		//getting the biggest number by using the Math.max() command.
		int bigNum = Math.max(a, b);
		int biggestNum = Math.max(bigNum,c);
		// Calculating the middle number by finding the value that's not the smallest or largest
		int middleNum = a + b + c - smallestNum - biggestNum;

		System.out.println(smallestNum + " " + middleNum + " " + biggestNum);
	}
}
