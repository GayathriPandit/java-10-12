package methods;

public class Cal {

	public static void main(String[] args) 
	{
	System.out.println("main starts");
	int res1=add(10,20);
	System.out.println(res1);
	int res2=sub(30,20);
	System.out.println(res2);
	System.out.println("main ends");
	}
   public static int add(int a,int b)
   {
	   System.out.println("addition starts");
	   int c =a+b;
	   return c;
   }
   public static int sub(int a, int b)
   {
	   System.out.println("subtration starts");
	   int c = a-b;
	   return c;
   }
}
