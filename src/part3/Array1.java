package part3;

public class Array1 
{
	public static void main(String[] args) {
		System.out.println("main starts");
		int[] a= new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(a);
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("======");
		String[] s=new String[3];
		s[0]="java";
		s[1]="sql";
		s[2]="selenium";
		System.out.println(s);
		for (int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		System.out.println("======");
		char[] c=new char[3];
		c[0]='p';
		c[1]='1';
		c[2]='3';
		
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		System.out.println(c);
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		System.out.println("========");
		boolean[] b=new boolean[3];
		b[0]= true;
		b[1]=false;
		b[2]=true;
		for(int i=0; i<b.length;i++)
		{
		System.out.println(b[i]);
		}
		
		System.out.println("main ends");
	}

}
