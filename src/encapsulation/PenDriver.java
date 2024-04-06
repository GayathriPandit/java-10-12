package encapsulation;

public class PenDriver {

	public static void main(String[] args) 
	{
		Pen p1=new Pen();
		p1.setBrand("Reynolds");
		p1.setPrice(5);
		p1.setColor("Blue");
		p1.setRefill(true);
		System.out.println(p1.getBrand());
		System.out.println(p1.getPrice());
		System.out.println(p1.getColor());
		System.out.println(p1.getRefill());
		System.out.println("============");
		Pen p2=new Pen();
		p2.setBrand("Flair");
		p2.setPrice(8);
		p2.setColor("Black");
		p2.setRefill(false);
		System.out.println(p2.getBrand());
		System.out.println(p2.getPrice());
		System.out.println(p2.getColor());
		System.out.println(p2.getRefill());
		System.out.println("============");
		Pen p3=new Pen();
		p3.setBrand("Parker");
		p3.setPrice(50);
		p3.setColor("Blue");
		p3.setRefill(false);
		System.out.println(p3.getBrand());
		System.out.println(p3.getPrice());
		System.out.println(p3.getColor());
		System.out.println(p3.getRefill());
	}

}
