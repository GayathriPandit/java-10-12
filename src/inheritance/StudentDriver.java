package inheritance;

public class StudentDriver {

	public static void main(String[] args) 
	{
		Student s1=new Student("Gayathri");
		s1.display();
		System.out.println("======");
		Student s2=new Student("Gayathri",12);
				s2.display();
	}

}
