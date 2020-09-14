//multiple exceptions

package demo3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class UdemyHandlingExceptions {

	public static void main(String[] args) {
		
		Test test = new Test();
		
//		try {
//			test.run();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ParseException e) {
//			System.out.println("Can't parse");
//		}
		
//		try {
//			test.run();
//		} catch (IOException | ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			test.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			test.input();
		} catch (FileNotFoundException e) {
			//FileNotFound has to be first, it is a child of IOException
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
