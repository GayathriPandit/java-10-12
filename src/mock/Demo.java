package mock;

public class Demo 
{
	int a=10;
	public void test()
	{
		System.out.println(a);
	}
	
	{
		a=10;
		test();
	}
	public static void main(String[] args) {
		System.out.println("java");
	}

}
