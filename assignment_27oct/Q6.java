//6. Write a Java program to remove the third element from an array list.

package assignment_27oct;

import java.util.ArrayList;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		// Adding elements in ArrayList
		al.add(11);
		al.add(22);
		al.add(33);
		al.add(44);
		al.add(55);
		
		System.out.println(al);
		
		// After removing an element
		al.remove(2);
		System.out.println(al);

	}

}
