package inheritance;

public class Student1 
{
	int sid;
	Student1(int sid)
	{
		this.sid =sid;
	}
	public void student1details()
	{
		System.out.println(sid);
	}
	public boolean equals(Object o) 
	{
		Student1 s= (Student1)o;
		return this.sid==s.sid;
	}
	public int hashCode()
	{
		return 1234;
	}

}
