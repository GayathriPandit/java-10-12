package demo;

public class Slave
{
	public static void main(String[] args) {
		Master m=new Master("karnataka",560072);
		Master m2=new Master("delhi",45887);
		m.printDetails();
		m2.printDetails();
	}

}
