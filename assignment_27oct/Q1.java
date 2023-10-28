//1. Write a Java program to create an array list, add some colors (strings)
//and print out the collection.
package assignment_27oct;

import java.util.ArrayList;
import java.util.Iterator;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList();
		al.add("Black");
		al.add("Blue");
		al.add("Orange");
		al.add("Pink");
		al.add("Red");
		
		// Using for each loop to print ArrayList
		
		for (String str : al) {
			System.out.println(str);
		}

	}

}
