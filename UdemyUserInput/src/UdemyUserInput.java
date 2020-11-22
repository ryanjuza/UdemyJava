import java.util.Scanner;

public class UdemyUserInput {
	public static void main(String[] args) {
		
		//scanner obj
		Scanner input = new Scanner(System.in);
		
		//output prompt
		System.out.println("Enter a line of text: ");
		//wait for user to input text
		String line = input.nextLine();
		System.out.println("You entered: " + line);
		
		//output prompt
		System.out.println("Enter an integer: ");
		//wait for user to input integer
		int value = input.nextInt();
		System.out.println("You entered: " + value);
	}
}
