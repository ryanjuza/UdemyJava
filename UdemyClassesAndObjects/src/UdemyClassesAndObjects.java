
class Person{
	String name;
	int age;
	
	void speak() {
		System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
	}
	
	int yearsUntilRetirement() {
		int yearsLeft = 65 - age;
		return yearsLeft;
	}
	
	int getAge() {
		return age;
	}
	
	String getName() {
		return name;
	}
}


public class UdemyClassesAndObjects {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		
		person1.name = "Dude Guy";
		person1.age = 32;
		person1.speak();
		int years = person1.yearsUntilRetirement();
		
		int age = person1.getAge();
		String name = person1.getName();
		
		System.out.println(name + "'s years left until retirement: " + years + ".");
		
		Person person2 = new Person();
		person2.name = "Sally Studebaker";
		person2.age = 27;
		person2.speak();
		
		
		

	}

}
