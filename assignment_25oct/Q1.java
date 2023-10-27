package assignment_25oct;

import java.util.ArrayList;//Imported the class

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList();
		boolean t = true;
		al.add("Vaibhav");
		if (al.isEmpty() == t) {
			System.out.println("Array List is EMPTY");
		}
		else {
			System.out.println("Array List is NOT EMPTY");
		}
		al.remove(0);
		if (al.isEmpty() == t) {
			System.out.println("Array List is EMPTY");
		}
		else {
			System.out.println("Array List is NOT EMPTY");
		}
	}

}
