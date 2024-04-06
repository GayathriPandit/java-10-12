package methods;

public class Calling {

	public static void main(String[] args) 
	{
	System.out.println("main starts");
	java();
	System.out.println("main ends");
	}
    public static void java()
    {
    	phython();
    	System.out.println("java is executing");
    }
    public static void phython()
    {
    	c();
    	System.out.println("phython is executing");
    }
    public static void c()
    {
    	javascript();
    	System.out.println("c is executing");
    }
    public static void javascript()
    {
    	html();
    	System.out.println("javascript is executing");
    }
    public static void html()
    {
    	sql();
    	System.out.println("html is executing");
    }
    public static void sql()
    {
    	
    	System.out.println("sql is executing");
    }
}
