//8. Write a Java program to sort a given array list.

package assignment_27oct;

import java.util.ArrayList;
import java.util.Collections;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(99);
		al.add(78);
		al.add(1009);
		al.add(44);
		al.add(89);
		
		Collections.sort(al);
		System.out.println(al);

	}

}
