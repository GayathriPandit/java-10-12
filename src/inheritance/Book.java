package inheritance;

public class Book 
{
	String bname;
	int bid;
	Book(String bname,int bid)
	{
		this.bname = bname;
		this.bid=bid;
		
	}
	public void bookDetails()
	{
		System.out.println(bname);
		System.out.println(bid);
	}
	public boolean equals(Object o)
	{
		Book b= (Book)o;
		return this.bname==b.bname
		&&this.bid==b.bid;
		
		
	}

}
