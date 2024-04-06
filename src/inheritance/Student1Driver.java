package inheritance;

public class Student1Driver extends Object
{
	public static void main(String[] args) 
	{
		Student1 s1=new Student1(111);
		Student1 s2=new Student1(111);
		System.out.println(s1==s2);//address
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		//System.out.println(s1.sid==s2.sid);
	}

}
