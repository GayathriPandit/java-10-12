package demo;

public class newFolderDriver {
	public void changeNo() {
		newFold f1=new newFold("ding",5489);
		f1.setCno(0);
	}
	public void ShowName()
	{
		newFold f1=new newFold("ding",5489);
				f1.setCno(123456);
				System.out.println(f1.getCno());
	}
	public static void main(String[] args)
	{
		newFold f1=new newFold("ding",5489);
		newFolderDriver f = new newFolderDriver();
		f.changeNo();
		f.ShowName();
	}
}
