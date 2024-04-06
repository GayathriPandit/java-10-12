package nonStaticMembers;

public class Book1Driver 
{
	public static void main (String args[])
	{
		Book1 b1=new Book1("abc",150,1);
		b1.book1Details();
		Book1 b2=new Book1();
		b2.book1Details();
		Book1 b3=new Book1("bhg",200,2);
		b3.book1Details();
		
	}

}
