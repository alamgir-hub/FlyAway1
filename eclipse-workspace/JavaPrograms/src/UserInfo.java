import java.util.Scanner;

public class UserInfo {
	
public static void main ( String [] args) {
	
	Scanner s = new Scanner(System.in);
	
	System.out.print("What is your First Name:");
	String fname = s.next();
	System.out.print("What is yourLast Name:");
	String lname = s.next();
	System.out.print("Choose your Grade from ( 9- 12 ):");
	int grade = s.nextInt();
	System.out.print("Student ID:");
	long sid = s.nextLong();
	System.out.print("What is your Login Name:");
	String login_name = s.next();
	System.out.print(" GPA (0.0 - 4.0 )");
	float gpa = s.nextFloat();
	
	System.out.println("Your Information");
	System.out.println("Name	: "+ fname+"," + lname);
	System.out.println("ID	: "+ sid);
	System.out.println("Login	: "+ login_name);
	System.out.println("GPA	: "+ gpa);
	System.out.println("Grade	: "+ grade);
}
}
