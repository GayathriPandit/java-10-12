package demo;

public class Calculator {

	public static void main(String[] args) 
	{
	int a= 20; int b=10;
	
	String choice="mul";
	switch (choice)
	{
	case "add" :
	{
		int res = a+b;
		System.out.println("Addition of two numbers is "+res);
	}break;
	case "sub" :
	{
		int res = a-b;
		System.out.println("Subtraction of two numbers is "+res);
	}break;
	case "mul" :
	{
		int res = a*b;
		System.out.println("Multiplication of two numbers is "+res);
	}break;
	case "div" :
	{
		int res = a/b;
		System.out.println("Division of two numbers is "+res);
	}break;
	default :
	{
		System.out.println("invalid choice");
	}break;
	
	}
	
	}

}
