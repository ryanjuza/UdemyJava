//can cast the value of a bigger to smaller
//smaller to bigger does automatically

class Machine {
	public void start() {
		System.out.println("Machine started");
	}
}

class Camera extends Machine{
	public void start() {
		System.out.println("Camera started");
	}
	
	public void snap() {
		System.out.println("Photo taken");
	}
}

public class UdemyCasting {

	public static void main(String[] args) {
		
		Machine machine1 = new Machine();
		Camera camera1 = new Camera();
		
		machine1.start();
		camera1.start();
		camera1.snap();
		
		//upcasting:
		Machine machine2 = camera1;
		machine2.start(); //this will use camera's snap
		//cannot do snap though, because Machine does not have snap
		
		//downcasting:
		Machine machine3 = new Camera();
		Camera camera2 = (Camera)machine3;
		camera2.start();
		camera2.snap();
		
//		byte byteValue = 20;
//		short shortValue = 55;
//		int intValue = 888;
//		long longValue = 42352;
//		float floatValue = 5235.4f;
//		double doubleValue = 32.4;
//		
//		System.out.println(Byte.MAX_VALUE);
//		
//		intValue = (int)longValue;
//		System.out.println(intValue);
//		
//		intValue = (int)doubleValue;
//		System.out.println(intValue);

	}

}
