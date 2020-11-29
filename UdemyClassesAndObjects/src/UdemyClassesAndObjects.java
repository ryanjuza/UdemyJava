
class Person{
	String name;
	int age;
	
	void speak() {
		System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
	}
}


public class UdemyClassesAndObjects {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		
		person1.name = "Dude Guy";
		person1.age = 32;
		person1.speak();
		
		Person person2 = new Person();
		person2.name = "Sally Studebaker";
		person2.age = 27;
		person2.speak();
		

	}

}
