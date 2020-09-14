package interview;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class interview {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("/Users/mbp13/Desktop/pf.txt");
		Scanner scan = new Scanner(file);
		
		int counter = 0;
		while(scan.hasNextLine()) {
			//String next = scan.next();
			Scanner scan2 = new Scanner(scan.nextLine());
			while (scan2.hasNext()) {
				System.out.println(counter);
				System.out.println(scan.nextLine());
			if (scan2.equals("pass")) {
				counter++;}
			}
		
			}
		scan.close();

		System.out.println("The word 'pass' appears " + counter + " times int the text file.");
	}

}
