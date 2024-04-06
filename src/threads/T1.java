package threads;

public class T1 extends Thread {
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(2000);//try n catch
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		T1 t= new T1();
		t.start();
	}

}
