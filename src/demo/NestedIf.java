package demo;

public abstract class NestedIf {

	public static void main(String[] args) 
	{
		
		System.out.println("main starts");
		String id ="admin"; int pwd = 1234;
		if (id =="admin")
		{
			System.out.println("id is verified, kindly enter your password");
			
			if (pwd==1234)
			System.out.println("login succesfull");
			else
				System.out.println("password mismatch, enter valid password");
		
		}
		else
		{
			System.out.println("enter valid id");
			System.out.println("login unsuccesfull");
		}
		System.out.println("main ends");
		

	}

}
