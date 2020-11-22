import java.util.Scanner;

public class UdemyWhileLoops {
	public static void main(String[] args) {
		
		//////////while//////////////////////////////////
		int value = 0;
		boolean loop = value < 20;
		
		while(value < 10) {
		
		System.out.println("value = " + value);
		value++;
		}
		
		////////do while//////////////////////////////////
		
//		//wrong
//		Scanner scanner = new Scanner(System.in);
//		int val = scanner.nextInt();
//		while (val != 5) {
//			System.out.println("Enter a number: ");
//			val = scanner.nextInt();
//			}
//		System.out.println("Got 5!");
		
		//correct, will always run at least once
		Scanner scanner = new Scanner(System.in);
		int val = 0;
		do {
			System.out.println("Enter a number: ");
			val = scanner.nextInt();
		}
		while (val != 5);
		
		System.out.println("Got 5!");
	}
}
