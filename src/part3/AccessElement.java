package part3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class AccessElement 
{
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add('a');
		ls.add("hello");
		
		Iterator i=ls.iterator();
		
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		//System.out.println(i.next());
		// its no such element found  exception
	
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		//hasNext is used check whether element is present or not
		System.out.println("========");
		
		ListIterator li =ls.listIterator(ls.size());
		while(li.hasPrevious())
		{
			System.out.println(li.previous()); 
		}
		
	}

}
