import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UdemyReadingText {

	public static void main(String[] args) throws FileNotFoundException {
		
//		String filemane = "//Users/mbp13/eclipse-workspace/UdemyReadingText/test.txt";
		String filename = "test.txt";
		File textFile = new File(filename);
		Scanner in = new Scanner(textFile);
		
//		int value = in.nextInt();
//		System.out.println("Read value " + value);
		
		int count = 1;
		while(in.hasNextLine()) {
			String line = in.nextLine();
			System.out.println(count + ": " + line);
			count++;
		}
		
		in.close();
		

	}

}
