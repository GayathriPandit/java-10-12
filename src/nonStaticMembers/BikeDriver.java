package nonStaticMembers;

public class BikeDriver {

	public static void main(String[] args)
    {
		Bike b1=new Bike();
		b1.bikeDetails();
		b1.brand ="Yamaha";
		b1.cc=220;
		b1.color="Black";
		b1.disc=true;
		b1.bikeDetails();
		System.out.println("======");
		Bike b2=new Bike();
		b2.bikeDetails();
		b2.brand = "Bajaj";
		b2.cc=220;
		b2.color ="black";
		b2.disc=false;
		b2.bikeDetails();
		System.out.println("======");
		Bike b3=new Bike();
		b3.bikeDetails();
		b3.brand = "TVS";
		b3.cc=120;
		b3.color ="black";
		b3.disc=false;
		b3.bikeDetails();
		System.out.println("======");
		Bike b4=new Bike();
		b4.bikeDetails();
		b4.brand = "RoyalEnfeild";
		b4.cc=420;
		b4.color ="brown";
		b4.disc=true;
		b4.bikeDetails();
		System.out.println("======");
		Bike b5=new Bike();
		b5.bikeDetails();
		b5.brand = "Jupiter";
		b5.cc=220;
		b5.color ="blue";
		b5.disc=false;
		b5.bikeDetails();
	}

}
