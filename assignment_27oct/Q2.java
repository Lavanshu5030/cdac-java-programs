//2. Write a Java program to iterate through all elements in an array list.

package assignment_27oct;

import java.util.ArrayList;
import java.util.Iterator;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList();
		al.add("Black");
		al.add("Blue");
		al.add("Orange");
		al.add("Pink");
		al.add("Red");

		//Using Iterator concept
		// Iterator is interface with the declaration of 4 abstract method 
		System.out.println("Using Iterator:");
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}


	}

}
