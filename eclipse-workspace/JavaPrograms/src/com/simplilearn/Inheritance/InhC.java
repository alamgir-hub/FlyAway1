package com.simplilearn.Inheritance;
// multi level inheritance

public class InhC extends InhB
{
	public void methodC() {
		System.out.println("Local  / Child Class method");
	}
	
public static void main(String[] args) {
		
		InhC c = new InhC();
		c.methodA();//calling super class method
		c.methodB();//calling sub class method
		c.methodC();// calling local method
		
}
}
