
public class CreateVariable {
	
	public static void main( String[] args) {
		byte a=20;
		int y =20, x1=20, z1=y+x1;
		char z ='D';
		float f=10.99f, f1=9.99f, f2=f-f1;
		double d=10.0d, d1=3.0d, d2=d*d1;
		long l= 1000L;
		
		System.out.println("Integer values is " +z1 +" takes 4 bytes");
		System.out.println("Byte value is " +a +" takes 8 bits");
		System.out.println("Char value is " +z +" takes 2 bytes");
		System.out.println("Float value is " +f2 +" takes 4 bytes");
		System.out.println("Double value i s" +d2 +" takes 8 bytes");
		System.out.println("Long value is " +l +" takes 8 bytes");
	}

}
