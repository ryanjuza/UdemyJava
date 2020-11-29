
class Person{
	String name;
	int age;
}


public class UdemyClassesAndObjects {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		
		person1.name = "Dude Guy";
		person1.age = 32;
		
		Person person2 = new Person();
		person1.name = "Sally Studebaker";
		person1.age = 27;
		
		System.out.println(person1.name);
	}

}
