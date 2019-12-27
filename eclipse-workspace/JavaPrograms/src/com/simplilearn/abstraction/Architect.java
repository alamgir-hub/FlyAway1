package com.simplilearn.abstraction;
// Partial implementation
public abstract class Architect {

	void design()
	{
		//implemented method or non abstract method
		System.out.println("House design by Architect");
	}
	//unimplemented method or abstract method
	abstract void build();
}
