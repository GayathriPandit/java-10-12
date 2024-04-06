package encapsulation;

public class BankDriver {

	public static void main(String[] args)
	{
		Bank b1=new Bank();
		b1.setBname("SBI");
		b1.setAccNo(125894663);
		b1.setBal(2563.1);
		b1.setLoc("Banglore");
		System.out.println(b1.getBname());
		System.out.println(b1.getAccNo());
		System.out.println(b1.getBal());
		System.out.println(b1.getLoc());
		System.out.println("==========");
		Bank b2=new Bank();
		b2.setBname("BOM");
		b2.setAccNo(156692156);
		b2.setBal(21896.3);
		b2.setLoc("Belagavi");
		System.out.println(b2.getBname());
		System.out.println(b2.getAccNo());
		System.out.println(b2.getBal());
		System.out.println(b2.getLoc());
		System.out.println("==========");
		Bank b3=new Bank();
		b3.setBname("BOB");
		b3.setAccNo(179926632);
		b3.setBal(261155.2);
		b3.setLoc("Hubballi");
		System.out.println(b3.getBname());
		System.out.println(b3.getAccNo());
		System.out.println(b3.getBal());
		System.out.println(b3.getLoc());
		System.out.println("==========");
		
	}

}
