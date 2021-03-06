class Frog{
	
	private int id;
	private String name;
	
	public Frog(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		StringBuilder sbBuilder = new StringBuilder();
		sbBuilder.append(id).append(": ").append(name);
		return sbBuilder.toString();
	}
}

public class UdemyStringFormatting {

	public static void main(String[] args) {
		
		//Inefficient
		String info = "";
		info += "My name is Bob.";
		info += " ";
		info += "I am a builder.";
		System.out.println(info);
		
		//correct
		StringBuilder sb = new StringBuilder();
		sb.append("My name is Sue.");
		sb.append(" ");
		sb.append("I am a lion tamer.");
		System.out.println(sb.toString());
		
		//appending without scope delimiter
		StringBuilder s = new StringBuilder();
		s.append("My name is Ryan.")
		.append(" ")
		.append("I am a software developer.");
		System.out.println(s.toString());
		//keep in mind, StringBuilder and Buffer are the same
		//Builder is more efficient
		
		
		//all objects have certain methods
//		Object obj = new Object();
//		
//		obj.
		Frog frog1 = new Frog(7, "Bobby");
		System.out.println(frog1);
		
	}

}
