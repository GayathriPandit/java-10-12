package part3;

import java.util.ArrayList;

public class ListProperties {
public static void main(String[] args) {
	ArrayList ls = new ArrayList();// non generic arraylist 
	ls.add("student");
	ls.add(20);
	ls.add(60);
	ls.add(10.5);
	ls.add(20);
	System.out.println("before removing : "+ls);
	ls.remove(3);
	System.out.println("after removing : "+ls);
	System.out.println("========");
	System.out.println("before replacing : "+ls);
	ls.set(0,"Teacher");//list is index based
	System.out.println("after replacing : "+ls);
	
}
}
//1.list is order collection of elements
//2.list is may also contain duplicate elements
//3.list is index based
//4.list is not synchronized(not thread safe)