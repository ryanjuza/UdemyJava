
public class UdemyIfStatements {
	public static void main(String[] args) {
		
		boolean cond = 1 < 6;
		
		System.out.println(cond);
		
		if(4 == 4) {
			System.out.println("Yes, that is true");
		}
		
		int myInt = 10;
		
		if (myInt > 10) {
			System.out.println("It is indeed greater than 10");
		}
		else if (myInt < 10) {
			System.out.println("It is indeed less than 10");
		}
		else {
			System.out.println("It is 10");
		}
	}
}
