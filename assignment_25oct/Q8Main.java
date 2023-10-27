package assignment_25oct;

import java.util.LinkedList;
import java.util.ArrayList;

public class Q8Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Created Linked list to store objects 
		//Generic Declaration
		LinkedList<PersonQ8> p = new LinkedList<PersonQ8>();
		p.add(new PersonQ8("Ganesh", 30, "123 Kothrud", "922340982"));
		p.add(new PersonQ8("Piyush", 29, "Pune hinjewadi", "93939393"));
		
		// Using for each loop to print LinkedList 
		
		System.out.println("LinkedList:");
		for (PersonQ8 person : p) {
			System.out.println(person);
		}
		System.out.println();
		
		// Generic ArrayList Declaration
		ArrayList<PersonQ8> al = new ArrayList<PersonQ8>();
		al.add(new PersonQ8("Lavanshu", 22, "Kothrud Pune", "7224031695"));
		al.add(new PersonQ8("Karan", 23, "Bhopal", "722737373"));
		
		// Using for each loop to print ArrayList
		System.out.println("ArrayList:");
		for (PersonQ8 person2 : al) {
			System.out.println(person2);
		}
		

	}

}
