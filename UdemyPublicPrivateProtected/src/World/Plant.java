package World;

public class Plant {
	public String name;
	
	//public is acceptable in this case because it is final
	public final static int ID = 8;
	
	private String type;
	
	protected String size;
	
	int height;
	
	public Plant() {
		name = "Ficus";
		type = "plant";
		size = "medium";
	}
}
