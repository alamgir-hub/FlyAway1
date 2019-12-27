
public class TypeCasting {
	
	public static void main(String[] args) {		
		byte b =100;		
		int i =b;
		int i1 = 1000;
		long l = b+i+i1;
		float f = 1000 + l;
		double d=f;
		long x= l+i;
		
		System.out.println(b);
		System.out.println(i);
		System.out.println(i1);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(x);
		
	}

}
