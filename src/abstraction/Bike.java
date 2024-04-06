package abstraction;

public class Bike extends Vechicle {

	//Override
	public void start()
	{
		System.out.println("bike is starting");
	}
	//override
	public void stop()
	{
		System.out.println("bike has stopped");
	}
	
}
//start()===>concrete method
//stop()===>concrete method
//run ===> non static method
//the method having implementation is called concrete method