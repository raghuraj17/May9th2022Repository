package com.sgtesting.calculator.sourcecode;

public class Calculator {
	public int addition(int num1,int num2)
	{
		int result=0;
		try
		{
			result=(num1+num2);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return result;
	}
	
    public int division(int num1,int num2)
	{
		int result=0;
		try
		{
			result=(num1/num2);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return result;
	}
	
	public int multiplication(int num1,int num2)
	{
		int result=0;
		try
		{
			result=(num1*num2);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return result;
	}
	
	public int Substraction(int num1,int num2)
	{
		int result=0;
		try
		{
			result=(num1-num2);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return result;
	}
}

