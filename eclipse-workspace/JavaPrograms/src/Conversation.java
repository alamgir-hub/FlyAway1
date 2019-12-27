import java.util.Scanner;

public class Conversation {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("What is your name ?");
		String name = s.next();
		System.out.println("Hi "+name);
		System.out.println("What city you live in?");
		String city = s.next();
		System.out.println("City: "+city);
		
	}

}
