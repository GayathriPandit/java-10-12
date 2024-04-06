package exception;

public class E2 {
public static void main(String[] args) {
	System.out.println("main starts");

	int[] a= {10,20,30};
	System.out.println(a[1]);
	System.out.println(a[0]);
	System.out.println(a[2]);
	
try
{
	System.out.println(a[3]);
}
catch(Exception c) {
	System.out.println("invalid index");
}
System.out.println("main ends");
}
}
