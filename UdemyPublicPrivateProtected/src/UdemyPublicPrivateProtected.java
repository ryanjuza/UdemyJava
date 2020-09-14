import World.Plant;

/*
 * private - only in same class
 * public - from anywhere
 * protected - same class, subclass, package
 * no modifier - same package only
 */

public class UdemyPublicPrivateProtected {

	public static void main(String[] args) {
		
		Plant plant = new Plant();
		System.out.println(plant.name);
		System.out.println(plant.ID);
		//will not work, plant is private
		//System.out.println(plant.type);
		
		//won't work, size is protected and in different package
		//System.out.println(plant.size);
		
		//unspecified variable will not work either
		//System.out.println(plant.height);

	}

}
