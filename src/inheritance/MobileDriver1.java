package inheritance;

public class MobileDriver1 {

	public static void main(String[] args) 
	{
		Mobile m=new Samsung();//rtp
		m.camera();m.speaker();m.ram();
		System.out.println("======");
		Mobile m1=new Mobile();//ctp
		m1.camera();m1.speaker();m1.ram();

	}

}
