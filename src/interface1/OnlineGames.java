package interface1;

public class OnlineGames implements Games
{
	public void freefire() {
		System.out.println("freefire is on fire");
		
	}@Override
	public void ludo()
	{
		System.out.println("ludo is on");
	}@Override
	public void chess()
	{
		System.out.println("chess is on");
	}@Override
	public void candyCrush()
	{
		System.out.println("candycrush is on");
		
	}
}
