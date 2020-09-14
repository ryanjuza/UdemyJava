
//parameters
class Robot {
	public void speak(String text) {
		System.out.println(text);
	}
	
	public void jump(int height) {
		System.out.println("Jumping " + height);
	}
}

public class UdemyMethods {

	public static void main(String[] args) {
		Robot sam = new Robot();
		sam.speak("Hi I'm Sam");
		sam.jump(8);
	}

}
