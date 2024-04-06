package inheritance;

public class VechileDriver {

	public static void main(String[] args) 
	{
//upcasting
		Vechile v=new Bike();
		System.out.println(v.name);
		v.vechileDetails();
		//downcasting
		Bike b=(Bike)v;
		System.out.println(b.name);
		b.vechileDetails();
		System.out.println(b.bname);
		b.bikeDetails();
	}

}
