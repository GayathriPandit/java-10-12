package nonStaticMembers;

public class BriyaniDriver {

	public static void main(String[] args)
	{
		Briyani b1=new Briyani();//default constructor
		b1.briyaniDetails();
		System.out.println("======");
		Briyani b2=new Briyani("Chicken",150,"Yellow");//parameterized constructor
		b2.briyaniDetails();
		System.out.println("======");
		Briyani b3=new Briyani("mushroom",200,"brown");
		b3.briyaniDetails();
		System.out.println("=======");
		Briyani b4=new Briyani("donne",250,"green");
		b4.briyaniDetails();
	}

}
