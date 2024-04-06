package nonStaticMembers;

public class BankDetails 
{
	public static void main(String[] args)
	{
		Bank b1=new Bank();
		b1.bal=118662.14;
		b1.bname="khj";
		b1.accNo=496214455;
		b1.fd=true;
		b1.bankDetails();
		System.out.println("======");
		Bank b2=new Bank();
		b2.bal=586158.364;
		b2.bname="hyu";
		b2.accNo=489632156;
		b2.fd=false;
		b2.bankDetails();
		System.out.println("======");
		Bank b3=new Bank();
		b3.bal=25896.365;
		b3.bname="drfg";
		b3.accNo=918523654;
		b3.fd=true;
		b3.bankDetails();
		System.out.println("======");
		Bank b4=new Bank();
		b4.bal=58966.15;
		b4.bname="rty";
		b4.accNo=425893155;
		b4.fd=true;
		b4.bankDetails();
		System.out.println("======");
		Bank b5=new Bank();
		b5.bal=25963.124;
		b5.bname="vgbh";
		b5.accNo=258931155;
		b5.fd=false;
		b5.bankDetails();
	}

}
