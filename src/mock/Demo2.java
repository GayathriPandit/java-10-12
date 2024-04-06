package mock;

public class Demo2 {
int a=10;
public static void test()
{
	Demo d =new Demo();
	System.out.println(d.a);
}
public int hashCode()
{
	return a;
}
public static void main(String[] args) {
	Demo a=new Demo();
	Demo a1= new Demo();
	System.out.println(a.hashCode()==a1.hashCode());
	System.out.println(a.equals(a1));
}
}
