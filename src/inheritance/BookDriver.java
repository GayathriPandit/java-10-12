package inheritance;

public class BookDriver extends Object
{
	public static void main(String[] args) 
	{
		Book b1=new Book("abc",150);
		Book b2= new Book("abc",150);
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));
	}
}
