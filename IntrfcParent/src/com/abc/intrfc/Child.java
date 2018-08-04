package com.abc.intrfc;

//sub class definition
public class Child extends Parent1 implements Parent2{
	
	//displaying data from parents
	public void disp()
	{
		System.out.println("From Parent1 :: "+getVar());
		System.out.println("From Parent2 :: "+vari);
	}

}
