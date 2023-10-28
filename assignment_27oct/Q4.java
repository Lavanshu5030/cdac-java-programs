package assignment_27oct;

import java.util.ArrayList;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declaring ArrayList 
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		// Adding an element in ArrayList
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		
		System.out.println(al);
		
		// Retrieving an element
		for (int i = 0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		

	}

}
