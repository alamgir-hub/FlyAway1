import java.util.Scanner;

public class AgeInfo {
	public static void main( String [] args) {
		
		Scanner s= new Scanner( System.in);
		
		System.out.print("Hello. What is your name?");
		String name = s.next();
		System.out.print("Hi," + name + "!  How old are you?");
		int age=s.nextInt();
		int next_age= age+5;
		int pre_age=age-5;
		System.out.println("Did you know that in five years you will be " + next_age +" years old?" );
		System.out.println("And five years ago you were " +pre_age+ "! Imagine that! ");
	}

}
