package assignment_25oct;

import java.util.ArrayList;

import java.util.LinkedList;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>(); 
		al.add(10);
		al.add(9);
		al.add(8);
		al.add(7);
		
		int n = al.size();
		// Sorting ArrayList
		 for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (al.get(j) > al.get(j + 1)) {
	                    // Swap the elements
	                    int temp = al.get(j);
	                    al.set(j, al.get(j + 1));
	                    al.set(j + 1, temp);
	                }
	            }
	        }
		System.out.println(al);
		
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(10);
		l.add(9);
		l.add(29);
		l.add(2);
		
		int lsize = l.size();
		for(int i = 0; i<lsize; i++) {
			for (int j = 0; j<lsize-1; j++) {
				if (l.get(j) > l.get(j + 1)) {
                    // Swap the elements
                    int temp = l.get(j);
                    l.set(j, al.get(j + 1));
                    l.set(j + 1, temp);
				
			}
		}

	}
		System.out.println(l);
	
	
	}
}
