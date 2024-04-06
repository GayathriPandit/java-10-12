package interface1;

public class StudentDriver 
{
	public static void main(String[] args)
	{
		Standard1 s1=new Student();
		s1.schoolname();s1.address();s1.percentage();
		System.out.println("========");
		Standard2 s2=new Student();
		s2.schoolname();s2.address();s2.cgpa();
		
	}

}
