
public class ObjectTypeConversion {
	
	public static void main(String[] args)
	{
		// converting a primitive to object type
		int number = 100;
		Integer obj = Integer.valueOf(number);// converting into Integer explicitly
		System.out.println(number + " " + obj);
		
		int num2 = 1002;
		Integer numobj= num2;// Implicit conversion/Auto boxing		
		System.out.println(num2 + " " + numobj);
		
		//converting an object type to primitive
		Integer obj2 = new Integer(100);
		int num = obj2.intValue();
		int num3 = obj2;// Auto un-boxing
		System.out.println(num + " " + obj2);
		System.out.println(num3 +  " " + obj2);
		
		
		
		//converting a primitive to object
		float f = 100.0f;
		Float obj3 = Float.valueOf(f);
		Float objf= obj3;
		System.out.println(f + " " + obj3);
		
		Float obj4 = new Float(100.0);
		float num1 = obj4.floatValue();
		System.out.println(num1 +" " + obj4);
		
		Double dobj = new Double(100);
		double d = dobj.doubleValue();
		System.out.println(d + " " + dobj);
		
	}

}
