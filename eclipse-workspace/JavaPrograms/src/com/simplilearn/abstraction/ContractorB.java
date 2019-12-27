package com.simplilearn.abstraction;

public class ContractorB extends Architect{

	void build()
	{
		System.out.println("House is build by Contactor B");
	}
	//method override in sub class
	void design()
	{
		System.out.println("House design is changed by Contractor B");
	}
	public static void main(String[] args) {
		ContractorB arch = new ContractorB();
		arch.design();
		arch.build();
		
	}

}
