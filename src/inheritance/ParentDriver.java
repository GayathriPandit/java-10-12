package inheritance;

public class ParentDriver
{
	public static void main(String[] args)
	{
		Parent p=new Parent();
		p.showmessage();
		System.out.println(p.name);
		Child c=(Child)p;
		c.showmessage();
		c.showmessage1();
		System.out.println(c.name);
		System.out.println(c.age);
		
	}

}
