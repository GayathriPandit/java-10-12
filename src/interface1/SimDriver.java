package interface1;

public class SimDriver
{
	public static void main(String[] args)
	{
		Airtel a=new Sim();
		a.color();a.number();a.network();a.range();
		Idea i=new Sim();
		i.number();i.color();i.network();
	}

}
