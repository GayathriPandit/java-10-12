
public class Demo {
static byte b=7;
static short s=b;

static 
{
	System.out.println(s);
}
static 
{
	b=32;
	System.out.println(b);
}
{
byte b=13;
System.out.println(b);
}
public static void main(String[] args) {
	b=23;
	System.out.println(b);
}
}
