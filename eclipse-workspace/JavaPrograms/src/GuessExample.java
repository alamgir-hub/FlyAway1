import java.util.Scanner;

public class GuessExample {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Guess a no between 1 and 10");
	int n = s.nextInt();
	int lotNo =5;
	do
	{
		System.out.println("Try Again");
		n = s.nextInt();
		
	}while (n!=lotNo);
	System.out.println("Well Done, You guessed it right!!!");
}
}
