
public class MExample {

	static void myMethod() {
		System.out.println("Void Non Parameterized Function ");
	}
	
	static void yourMethod(int number)
	{
		System.out.println("Void type single Parameterized Function");
		System.out.println("param 1 " +number);
	}	
	static float weMethod(int number, float fNumber)
	{
		System.out.println("Void type 2 Parameterized Function");
		System.out.println("param 1 " +number);
		System.out.println("Param 2 " +fNumber);
		return fNumber;
	}
	static int ourMethod()
	{
		System.out.println("Int type Non Parameterized function");
		return 10;
	}
	public static void main(String[] args) {
		myMethod();
		yourMethod(12);
		ourMethod();
		weMethod(12, 12.0f);
	}
}
