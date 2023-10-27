package assignment_25oct;

import java.util.ArrayList;

import java.util.Iterator;

public class Q6 {

	public static void main(String[] args)  
    {  
        ArrayList<Integer> al = new ArrayList<Integer>();  
    
        al.add(1);  
        al.add(2);  
        al.add(3);  
        al.add(4);  
        al.add(5);  
    
        Iterator iterator = al.iterator();  
        int num=0;
        while (iterator.hasNext()) {
         num = (Integer) iterator.next();
   
        if (num % 2 != 0) {
        	iterator.remove();
        }
        }
        System.out.println(al);  
    }  
}  


