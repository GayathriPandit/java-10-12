package part3;

import java.util.HashSet;

public class Hs {
public static void main(String[] args) {
	System.out.println("main starts");
	HashSet hs = new HashSet();
	hs.add(10);
	hs.add("shirin");
	hs.add(true);
	hs.add(null);
	hs.add('n');
	hs.add("shirin");
	System.out.println(hs.size());//does not consider duplicate values
	System.out.println(hs);
	for(Object o:hs)
	{
		System.out.println(o);
	}
	System.out.println("main ends");
}
}
