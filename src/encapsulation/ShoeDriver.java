package encapsulation;

public class ShoeDriver {

	public static void main(String[] args)
	{
		Shoe s1=new Shoe();
		s1.setBrand("Woodland");
		s1.setColor("Black");
		s1.setSize(8);
		s1.setPrice(2000);
		System.out.println(s1.getBrand());
		System.out.println(s1.getColor());
		System.out.println(s1.getSize());
		System.out.println(s1.getPrice());
		System.out.println("=======");
		Shoe s2=new Shoe();
		s2.setBrand("Puma");
		s2.setColor("White");
		s2.setSize(7);
		s2.setPrice(2500);
		System.out.println(s2.getBrand());
		System.out.println(s2.getColor());
		System.out.println(s2.getSize());
		System.out.println(s2.getPrice());
		System.out.println("=======");
		Shoe s3=new Shoe();
		s3.setBrand("Adidas");
		s3.setColor("Green");
		s3.setSize(6);
		s3.setPrice(2200);
		System.out.println(s3.getBrand());
		System.out.println(s3.getColor());
		System.out.println(s3.getSize());
		System.out.println(s3.getPrice());
		System.out.println("=======");
		
		

	}

}
