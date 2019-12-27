
public class ExTypeCasting {
	
	public static void main(String[] args)
	{
		double d= 100.0d;
		long l= (long)d;	
		int i = (int)l;
		
		double d1= d+l; // double can be store into double
		long l1= l+(long)d1; // double cannot be stored  into long
		
		int i2 = (int)l+i+(int)d1+(int)l1;
		System.out.println(d1);
		System.out.println(l1);
		System.out.println(i2);
		
	}

}
