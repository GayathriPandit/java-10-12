package nonStaticMembers;

public class EmployeeDriver {

	public static void main(String[] args)
	{
		Employee e1=new Employee();
		e1.employeeDetails();
		e1.name="Girish";
		e1.sal=2500000.0;
		e1.eid=145;
		e1.employeeDetails();
		System.out.println("=======");
		Employee e2=new Employee();
		e2.employeeDetails();
		e2.name="Aayu";
		e2.employeeDetails();

	}

}
