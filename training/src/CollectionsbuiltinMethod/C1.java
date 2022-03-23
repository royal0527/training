package CollectionsbuiltinMethod;

import java.util.ArrayList;
import java.util.Collections;

public class C1 {
public static void main(String args[])
{
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(1);
	al.add(2);
	al.add(3);
	al.add(4);
	al.add(4);	
    int i=Collections.binarySearch(al, 3);
    System.out.println("at index"+i);    
    System.out.println(Collections.max(al));
    System.out.println(Collections.frequency(al,4));
    Collections.rotate(al, 3);
    System.out.println(al);
    	Collections.sort(al);
    	System.out.println(al);
    
    
    }
}
