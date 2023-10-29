//7. Write a Java program to search for an element in an array list.

package assignment_27oct;

import java.util.ArrayList;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declaring an ArrayList
		ArrayList<Integer> al = new ArrayList <Integer>();
		al.add(5);
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);
		
		System.out.println(al);
		
		// Using functions
		System.out.println(al.contains(15));
		System.out.println(al.indexOf(15));
		
		// Iterating
		
		for (int i = 0; i<al.size(); i++) {
			if (al.get(i) == 15) {
				System.out.println(i);
			}
		}
		

	}

}
