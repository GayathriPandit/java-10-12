package demo;

public class User {
private static String bname;
bname="kava";
public static void main(String[] args) {
	Bank b=new Bank();
	System.out.println(b.bname);
	System.out.println(User.bname);
}
}
