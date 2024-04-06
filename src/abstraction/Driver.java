package abstraction;

public class Driver {
public static void main(String[] args) {
	
	Vechicle v =new Bike();
	//Parent p=new son(); upcasting
	//for method overriding is-a relationship and upcastingis mandatory
	v.start();//rtp
	v.stop();  //rtp
	//while calling binding will be attached to parent class because of upcasting
	//binding is attached to parent ->start() n stop(), but we are acheiving diferent behavior as o/p this is called run time polymorphism
	v.run();  
	//binding is attached to run() as it is not overridden method, if we are executing it, binding achieved at compile time n same behavior is achieved as o/p this is called compile time polymorphism
} 
}
