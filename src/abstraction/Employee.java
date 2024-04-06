package abstraction;

abstract public class Employee extends Company 
{
//override
	public void ename()
	{
		System.out.println("employee name is aayu");
	}
	//override
	public void empId()
	{
		System.out.println("employee id is 45");
	}
	
}
// ename==>concrete method
//empId==>concrete method
//edept==>abstract method
//esal==>abstract method