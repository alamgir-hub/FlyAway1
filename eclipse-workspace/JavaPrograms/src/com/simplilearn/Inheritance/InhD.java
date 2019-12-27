package com.simplilearn.Inheritance;

public class InhD extends InhA{
	
	public void methodD() {
		System.out.println("Sub  / Child Class method");
	}

	public static void main(String[] args) {
		
		InhD d = new InhD();
		d.methodA();
		d.methodD();
	}
}
