package part3;
import java.util.ArrayList;
public class Arraylist {
	public static void main(String[] args) {
		System.out.println("main starts");
		ArrayList al= new ArrayList();
		al.add(10);
		al.add("anu");
		al.add(78.9f);
		al.add('v');
		al.add(true);
		al.add("anu");
		al.add(null);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println("=======");
		System.out.println(al.get(2));
		//System.out.println(al.get(250));
		System.out.println("========");
		System.out.println(al.contains("Anu"));
		System.out.println(al.contains("anu"));
		System.out.println("========");
		al.remove(2);
		System.out.println(al);
		System.out.println("========");
		System.out.println(al.isEmpty());
		al.clear();
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println("=========");
		ArrayList x= new ArrayList();
		x.add(20);
		x.add(10);
		x.add(30);
		x.add(10);
		x.add(30);
		x.add(10);
		x.add(60);
		System.out.println(x);
		System.out.println("========");
		System.out.println(x.indexOf(30));
		System.out.println(x.indexOf(10));
		System.out.println(x.indexOf(100));
		//return type of indexOf is int,if element is not present in list it will give -1
		System.out.println("========");
		// here default value cannot be stored
		//in array list if we have same data in multiple index, we can get only first and last index value of data
		System.out.println(x.lastIndexOf(30));
		System.out.println(x.lastIndexOf(10));
		System.out.println("main ends");
	}

}
