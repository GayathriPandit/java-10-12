package demo;

public class Circlee
{
	private double r=1;
	public double getArea() {
		return r*r*3.142;
		
	}
	public static void main(String[] args) {
		Circlee myCircle = new Circlee();
		System.out.println("radius is "+myCircle.r);
		System.out.println("area of circle is "+myCircle.getArea);
	}
}
