package com.simplilearn.abstraction;

public class Hero implements Action{
	
	

	public static void main(String[] args) {
		Action n = new Hero();
		n.comedy();
		n.fighting();
		n.dance();

	}

	
	public void fighting() {
		System.out.println("Fight");
		
	}

	
	public void dance() {
		System.out.println("Dance");		
	}

	
	public void comedy() {
		System.out.println("comedy");
		
	}

}
