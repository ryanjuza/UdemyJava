import java.util.Scanner;

public class Udemy {

	public static void main(String[] args) {

//		//while loop
//		int value = 0;
//		//boolean loop = value < 20;
//		while(value < 10) {
//			System.out.println("Bonjour " + value);
//			value++;
//		}
//		
//		//for loop
//		for (int i=0; i<5; i++) {
//			System.out.println("Ola " + i);
//		}

		// input, loops until user gets the right number
		Scanner scanner = new Scanner(System.in);

		/*
		 * //while loop System.out.println("Enter a number: "); int value =
		 * scanner.nextInt(); while(value !=5) { System.out.println("Enter a number: ");
		 * value = scanner.nextInt(); }
		 */

		// do while
		/*
		 * int value = 0; do { System.out.println("Enter a number: "); value =
		 * scanner.nextInt(); } while(value != 5);
		 * 
		 * System.out.println("You guessed it, it's 5!");
		 */

		// switch statement
		/*
		System.out.println("Please enter a command: ");
		String text = scanner.nextLine();
		switch (text) {
		case "start":
			System.out.println("Machine started!");
			break;

		case "stop":
			System.out.println("Machine stopped!");
			break;

		default:
			System.out.println("Enter start or stop");
		}
		*/
		
		//arrays
		int[] values;
		values = new int[3];
		System.out.println(values[0]);
		values[0] = 10;
		values[1] = 20;
		values[2] = 30;
//		System.out.println(values[0]);
//		System.out.println(values[1]);
//		System.out.println(values[2]);
		
		//loop through array
		for(int i=0; i<values.length; i++) {
			System.out.println(values[i]);
		}
	}

}
