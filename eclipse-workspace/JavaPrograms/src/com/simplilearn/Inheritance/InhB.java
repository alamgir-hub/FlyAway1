package com.simplilearn.Inheritance;

public class InhB extends InhA {

	public void methodB() {
		System.out.println("Sub  / Child Class method");
	}
	
	public static void main(String[] args) {
		
		InhB b = new InhB();
		b.methodA();//calling super class method
		b.methodB();// calling local methods
	}
}
