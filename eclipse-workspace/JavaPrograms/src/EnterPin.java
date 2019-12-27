import java.util.Scanner;

public class EnterPin {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Welcome to the Bank");
	System.out.println("Enter your pin");
	int pin = s.nextInt();
	int correct_pin = 1234;
	int trial =0;
	
	while( pin!= correct_pin && trial < 2)
	{
		System.out.println("Incorrect pin.  Try Again");
		System.out.println("Enter your pin again");
		pin = s.nextInt();
		trial ++;
	}
	if(pin == correct_pin)
	{
	System.out.println("Pin Accepted. You can access your account!");
	}
	else {
		System.out.println("you ran out of attempts!!!");
	}
}
}
