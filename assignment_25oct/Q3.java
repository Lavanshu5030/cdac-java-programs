package assignment_25oct;

import java.util.ArrayList;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		names.add("Tim");
		names.add("Jeff");
		names.add("Mary");
		
		ArrayList<String> newNames = reverse(names);
		System.out.println(newNames);
		

	}
	
	public static ArrayList<String> reverse(ArrayList<String> names){
		ArrayList<String> result  = new ArrayList<String>();
		for(int i = names.size()-1; i>=0; i--) {
			result.add(names.get(i));
		}
		return result;
		
	}

}
