package com.simplilearn.Polymorphism;

public class Bank {
//over loading
public static int showBalance(int balance) {
		if(balance > 2000) {
		System.out.println("Your Balance using int ");
		}return balance;
}
public static float showBalance(float balance) {
	
	System.out.println("Your Balance using float ");
	return balance;
}
public static double showBalance(double balance) {
	
	System.out.println("Your Balance using double ");
	return balance;
}

public static void main(String[] args) {
	showBalance(200d);
	
}
}

