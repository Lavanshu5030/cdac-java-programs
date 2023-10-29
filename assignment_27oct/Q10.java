//10. Write a Java program to shuffle elements in an array list.

package assignment_27oct;

import java.util.Collections;
import java.util.ArrayList;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList();
		al.add(101);
		al.add(103);
		al.add(104);
		al.add(109);
		al.add(110);
		
		System.out.println(al);
		
		// Shuffling arraylist
		
		Collections.shuffle(al);
		System.out.println();

	}

}
