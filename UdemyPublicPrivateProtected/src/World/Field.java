package World;

public class Field {
	private Plant plant = new Plant();
	
	public Field() {
		//works, size is protected and in the same package
		System.out.println(plant.size);
	}
}
