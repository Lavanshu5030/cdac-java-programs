//9. Write a Java program to copy one array list into another.

package assignment_27oct;

import java.util.ArrayList;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declaring ArrayList
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(10);
		al1.add(12);
		al1.add(14);
		al1.add(16);
		
		System.out.println(al1);
		
		// Giving reference to the second Arraylist
		
		ArrayList<Integer> al2 = al1;
		
		System.out.println(al2);
		
		
		
		
		

	}

}
