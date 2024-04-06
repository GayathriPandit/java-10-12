package encapsulation;

public class MovieDriver {

	public static void main(String[] args)
	{
		Movie m1=new Movie();
		System.out.println(m1.getPrice());
		System.out.println(m1.getMname());
		m1.setPrice(500);
		m1.setMname("leo");
		System.out.println(m1.getPrice());
		System.out.println(m1.getMname());
		System.out.println("======");
		Movie m2=new Movie();
		System.out.println(m2.getPrice());
		System.out.println(m2.getMname());
		System.out.println("======");
		Movie m3=new Movie();
		m3.setMname("billa");
		m3.setPrice(100);
		System.out.println(m3.getMname());
		System.out.println(m3.getPrice());

	}

}
