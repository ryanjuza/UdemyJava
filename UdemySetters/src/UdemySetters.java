
class Frog {
	String name;
	int age;
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}

public class UdemySetters {

	public static void main(String[] args) {
		Frog frog1 = new Frog();
		
//		frog1.name = "Ernie";
//		frog1.age = 7;
		
		frog1.setName("Ernie");
		frog1.setAge(7);

		System.out.println(frog1.getName());
		System.out.println(frog1.getAge());
	}

}
