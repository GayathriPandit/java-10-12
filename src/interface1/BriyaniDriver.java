package interface1;

public class BriyaniDriver 
{public static void main(String[] args) {
	Briyani b= new Briyani();
	b.briyaniDetails();
	Briyani b2=new Briyani("mutton",300);
	b2.briyaniDetails();
	System.out.println("========");
	System.out.println(b);
	System.out.println(b2);
}

}
