class plant {
	//use private as much as you can
	
	public static final int ID = 7;
	
	private String name;
	
	public String getData() {
		String data = "blady blah " + calculateGrowthForecast();
		return data;
	}
	
	public int calculateGrowthForecast() {
		return 9;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
public class UdemyEncapsulation {
	public static void main(String[] args) {
		
	}
}
