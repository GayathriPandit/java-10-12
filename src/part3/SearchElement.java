package part3;

import java.util.ArrayList;

public class SearchElement 
{
	public static void main(String[] args) {
		ArrayList ls = new ArrayList();// non generic arraylist 
		ls.add("student");
		ls.add(20);
		ls.add(60);
		ls.add(10.5);
		System.out.println(ls.contains(10));
		System.out.println(ls.containsAll(ls));
		System.out.println(ls.isEmpty());
        // ls.removeAll(ls);
	    System.out.println("=========");
        System.out.println("is the arraylist is empty : " +ls.isEmpty());
        ls.retainAll(ls);
        System.out.println(ls);
        System.out.println("=======");
        System.out.println("size is " + ls.size());
        
        
        Object[] obj = ls.toArray();
        //toArray() is used to convert collection to object type of array   
        System.out.println(obj);
        for (int i=0;i<obj.length;i++)
        {
        	System.out.println(obj[i]);
        }
        
	}

}
