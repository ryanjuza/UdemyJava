//Car inherits Machine and all of its methods etc
//Overriding method is using same method name as method in inherited class
public class Car extends Machine{
	
	@Override
	public void start() {
		System.out.println("Car started!");
	}

	public void wipeWindShield() {
		System.out.println("Wipey da windshild");
		System.out.println("Abbie is so preeeeaty!");
	}
}
