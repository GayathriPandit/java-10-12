package exception;

public class E3 {
public static void main(String[] args) {
	System.out.println("main starts");
	try
	{
		System.out.println(89/0);
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	System.out.println("main ends");
}
}
