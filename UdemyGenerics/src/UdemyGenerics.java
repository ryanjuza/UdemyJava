import java.util.ArrayList;
import java.util.HashMap;

class Animal {
	
}

class Machine {

	@Override
	public String toString() {
		return "I am a Machine";
	}
	
	public void start() {
		System.out.println("Machine started");
	}
	
}

class Camera extends Machine {

	@Override
	public String toString() {
		return "I am a Camera";
	}
	
	public void snap () {
		System.out.println("Pic snapped");
	}
	
}

public class UdemyGenerics {

	public static void main(String[] args) {
		
		//old
		ArrayList list = new ArrayList();
		list.add("apple");
		list.add("banana");
		list.add("orange");
		String fruit = (String)list.get(1);
		System.out.println(fruit);
		
		//modern
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("cat");
		strings.add("dog");
		strings.add("mouse");
		String animal = strings.get(1);
		System.out.println(animal);
		
		//more than one type of argument
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		//newest
		ArrayList<Animal> someList = new ArrayList<>();
		
		////////////////////////////////////////////////////////////
		//generics and wildcards
		ArrayList<Machine> list2 = new ArrayList<Machine>();
		list2.add(new Machine());
		list2.add(new Machine());
		
		ArrayList<Camera> list3 = new ArrayList<Camera>();
		list2.add(new Camera());
		list2.add(new Camera());
		
		showList(list2);
		showList(list3);
		
	}
	
	public static void showList(ArrayList<? extends Machine> list) {
		for(Machine value: list) {
			System.out.println(value);
			value.start();
		}
	}

}
