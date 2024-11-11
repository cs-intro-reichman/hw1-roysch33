// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// using the given command for getting the hours and minutes:
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		// finding if the hours are PM - from 13 till 23:
		if (hours > 12) {
			hours = hours - 12;
			// finding if the minutes are single digits:
			if (minutes < 10) {
				// if they are - adding 0 before the minutes:
				System.out.print(hours + ":");
				System.out.print(0);
				System.out.print(minutes + " PM");
			}
			else {
				System.out.println(hours + ":" + minutes + " PM");
			};
		}
		// we do the same for the minutes in the AM time:
		else {
			if (minutes < 10) {
				System.out.print(hours + ":");
				System.out.print(0);
				System.out.print(minutes + " AM");
			}
			else {
				System.out.println(hours + ":" + minutes + " AM");
			};
		}
	}
}