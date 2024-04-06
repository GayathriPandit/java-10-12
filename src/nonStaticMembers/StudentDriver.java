package nonStaticMembers;

public class StudentDriver {

	public static void main(String[] args)
	{
		Student s1=new Student();
		s1.studentDetails();
		Student s2=new Student("Gayathri", 1, 88);
		s2.studentDetails();
		
	}

}
