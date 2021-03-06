class Machine{
	private String name;
	private int code;
	
	//constructor, this will run automatically when the method is called!
	public Machine() {
		System.out.println("Constructor running!");
	}
	
	public Machine(String name) {
		System.out.println("Second constructor!");
		this.name = name;
	}
	
	public Machine(String name, int code) {
		System.out.println("Third constructor!");
		this.name = name;
		this.code = code;
	}
}

public class UdemyConstructors {

	public static void main(String[] args) {
		Machine machine = new Machine();
		
		Machine machine2 = new Machine("Arnold");
		
		Machine machine3 = new Machine("C3PO", 95);
	}

}
