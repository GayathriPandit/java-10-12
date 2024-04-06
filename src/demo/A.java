package demo;

public class A {
A(){this(40,50);}
A(int a,int b)
{
	this(30);
}
A(int c)
{
	int d=c*c;
	System.out.println(d);
}
public static void main(String[] args) {
	new A();
	
}
}
