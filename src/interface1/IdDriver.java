package interface1;

public class IdDriver
{
	public static void main(String[] args)
	{
		System.out.println("main starts");
		Pancard pc = new Id();
		pc.name();pc.address();pc.dob();pc.pno();
		System.out.println("=========");
		Aadharcard ac = new Id();
		//here we get the child properties even though it is upcasted,because of method overriding
		ac.name();ac.address();ac.dob();ac.ano();
		System.out.println("=========");
		Aadharcard ac1 = new Aadharcard();
		//here we are creating object for parent class, we are accessing parent properties
		ac1.name();ac1.address();ac1.dob();ac1.ano();
		System.out.println("main ends");
		
	}

}
