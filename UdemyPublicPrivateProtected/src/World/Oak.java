package World;

public class Oak extends Plant{
	public Oak() {
		//will not work, plant is private
		//type = "type";
		
		//will work, size is protected, so it works in subclasses
		size = "large";
		
		//works, height is in same package
		height = 10;
	}
}
