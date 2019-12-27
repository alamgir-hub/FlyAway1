import java.util.Random;
import java.lang.Math;

public class MethodExample {
	
	static void randomNumber()
	{
		Random r = new Random();
		int number = r.nextInt(1000);
		System.out.println(number);
		int sqr = (int)Math.sqrt(4);
		System.out.println(sqr);
	}
public static void main(String[] args) {
	randomNumber();
}
}
