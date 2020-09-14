package demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class UdemyHandlingExceptions {

	public static void main(String[] args) {
		
		File file = new File("test.txt");
		try {
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("File \"" + file.toString() + "\" not found.");
		}
		
		System.out.println("Finished");

	}

}
