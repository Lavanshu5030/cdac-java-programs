//5. Write a Java program to update an array element by the given element.

package assignment_27oct;

import java.util.ArrayList;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declaring ArrayList
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		// Adding elements
		al.add(12);
		al.add(24);
		al.add(48);
		
		System.out.println(al);
		
		// Updating element from the list
		for (int i = 0; i<al.size(); i++) {
			if (al.get(i) == 48) {
				al.set(i, 50);
			}
		}
		
		//Printing after updating element
		System.out.println(al);
		
		// ArrayList of string
		
		ArrayList<String> str = new ArrayList<String>();
		str.add("Books");
		str.add("Students");
		str.add("Teacher");
		
		System.out.println(str);
		
		for (int i = 0; i<str.size()-1; i++) {
			if (str.get(i) == "Books") {
				str.set(i,"Principal");
			}
		}
		
		System.out.println(str);


	}

}
