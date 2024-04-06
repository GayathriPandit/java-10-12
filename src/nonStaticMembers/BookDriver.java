package nonStaticMembers;

public class BookDriver 
{
	public static void main(String[] args)
	{
	Book b1=new Book();
	b1.bookDetails();
	b1.bname="Science";
	b1.bid=1;
	b1.author="Abc";
	b1.bprice=123;
	b1.bookDetails();
	System.out.println("=====");
	Book b2=new Book();
	b2.bname ="Maths";
	b2.bid=2;
	b2.author="Def";
	b2.bprice=456;
	b2.bookDetails();
	System.out.println("=====");
	
	Book b3=new Book();
	b3.bname ="Social";
	b3.bid=3;
	b3.author="Ghi";
	b3.bprice=789;
	b3.bookDetails();
	System.out.println("=====");	
	Book b4=new Book();
	b4.bname ="English";
	b4.bid=4;
	b4.author="Jkl";
	b4.bprice=321;
	b4.bookDetails();
	System.out.println("=====");
	Book b5=new Book();
	b5.bname ="Hindi";
	b5.bid=5;
	b5.author="Mno";
	b5.bprice=654;
	b5.bookDetails();
	System.out.println("=====");
	}
}
