//3. Write a Java program to insert an element into the array list at the first position.

package assignment_27oct;
import java.util.ArrayList;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//With add() method
		ArrayList<String> al = new ArrayList<String>();
		al.add("ball");
		al.add("cricket");
		al.add("Ball");
		al.add(0, "football");
		
		System.out.println(al);
		
		//Without add() method();
		
		System.out.println(al);

		

	}

}
