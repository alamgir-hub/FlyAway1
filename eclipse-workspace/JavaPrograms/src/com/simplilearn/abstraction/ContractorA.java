package com.simplilearn.abstraction;

public class ContractorA extends Architect{
	
	void build()
	{
		System.out.println("House is build by Contactor A");
	}

	public static void main(String[] args) {
		ContractorA arch = new ContractorA();
		arch.build();
		arch.design();
		
		Architect arch1 = new ContractorA();
		arch1.build();
		arch1.design();

	}

}
