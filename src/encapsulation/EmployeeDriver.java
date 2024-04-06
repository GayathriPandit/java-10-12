package encapsulation;

public class EmployeeDriver {

	public static void main(String[] args)
	{
		Employee e1=new Employee();
		e1.setEname("Gayu");
		e1.setId(1);
		e1.setDept("Testing");
		e1.setSal(25236.26);
		System.out.println(e1.getEname());
		System.out.println(e1.getId());
		System.out.println(e1.getDept());
		System.out.println(e1.getSal());
		System.out.println("=========");
		Employee e2=new Employee();
		e2.setEname("Giri");
		e2.setId(2);
		e2.setDept("Testing");
		e2.setSal(24153.36);
		System.out.println(e2.getEname());
		System.out.println(e2.getId());
		System.out.println(e2.getDept());
		System.out.println(e2.getSal());
		System.out.println("=========");
		Employee e3=new Employee();
		e3.setEname("Ayansh");
		e3.setId(3);
		e3.setDept("Developing");
		e3.setSal(27154.25);
		System.out.println(e3.getEname());
		System.out.println(e3.getId());
		System.out.println(e3.getDept());
		System.out.println(e3.getSal());
		System.out.println("=========");
		Employee e4=new Employee();
		e4.setEname("Sai");
		e4.setId(4);
		e4.setDept("Developing");
		e4.setSal(21522.25);
		System.out.println(e4.getEname());
		System.out.println(e4.getId());
		System.out.println(e4.getDept());
		System.out.println(e4.getSal());
	}

}
