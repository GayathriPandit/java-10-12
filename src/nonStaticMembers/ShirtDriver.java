package nonStaticMembers;

public class ShirtDriver 
{
	public static void main (String[] args)
	{
	Shirt s1=new Shirt();
	s1.shirtDetails();
	s1.size=20;
	s1.color="blue";
	s1.brand="biba";
	s1.button=true;
	s1.shirtDetails();
	System.out.println("******");
	Shirt s2=new Shirt();
	s2.size=22;
	s2.color="black";
	s2.brand="reymond";
	s2.button=false;
	s2.shirtDetails();
	System.out.println("******");
	Shirt s3=new Shirt();
	s3.size=26;
	s3.color="white";
	s3.brand="liba";
	s3.button=false;
	s3.shirtDetails();
	System.out.println("******");
	Shirt s4=new Shirt();
	s4.size=28;
	s4.color="orange";
	s4.brand="peter england";
	s4.button=true;
	s4.shirtDetails();
	System.out.println("******");
	Shirt s5=new Shirt();
	s5.size=26;
	s5.color="yellow";
	s5.brand="auro";
	s5.button=false;
	s5.shirtDetails();
	System.out.println("******");
	}

}
