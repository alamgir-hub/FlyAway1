package com.simplilearn.Polymorphism;

public class Restaurants {
// method over loading will be performed by
	//1. By changing the no of argument
	// by changing the parameter datatype
	public static void takeOrder() {
		
		System.out.println("Always serve coffee");
	}
public static int takeOrder(int price) {
		if (price>=20)
		{
			System.out.println("Serve Tea");
			return price;
	}
		if(price>=50)
		{
			System.out.println("Serve Sandwich");
			return price;
	}
		if(price>=80)
		{
			System.out.println("Serve Burger");
			return price;
	}
		return price;
}
public static void takeOrder(float price, int time) {
	if(price>=20 && time>20)
	{
		System.out.println("Serve Biryani");
	}
	else if(price>=800 && time>40) {
		System.out.println("Serve Mandi");
	}
}
	public static void main(String[] args) {
	takeOrder();
	
	}

}
