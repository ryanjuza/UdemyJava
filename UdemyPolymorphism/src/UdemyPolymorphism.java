
public class UdemyPolymorphism {
	
	public static void main(String[] args) {
		Plant plant1 = new Plant();
		Tree tree = new Tree();
		
		Plant plant2 = tree;
		plant2.grow();
		tree.shedLeaves();
		
		//does not work, plant does not have a shedLeaves for tree to override
		//plant2.shedLeaves();
	}
}
