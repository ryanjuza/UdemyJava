class Thing {
	//static are accessed without instantiating
	public String name;
	public static String description;
	
	public void showName() {
		System.out.println(name);
	}
	
	public static void showInfo() {
		System.out.println("showInfo method");
	}
}


public class UdemyStaticFinal {

	public static void main(String[] args) {
		
		Thing.description = "I am a thing";
		
		System.out.println(Thing.description);
		Thing.showInfo();
		
		Thing.showInfo();
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		thing1.name = "Bob";
		thing2.name = "Hank";

		System.out.println(thing1.name);
		System.out.println(thing2.name);
		
		thing1.showName();
	}

}
