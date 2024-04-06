
package exception;

public class E4 {
public static void main(String[] args) {
	System.out.println("main starts");
	try {
		m1();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("main ends");
	
}
public static void m1() throws Exception
{
	System.out.println(78/0);
}
}
