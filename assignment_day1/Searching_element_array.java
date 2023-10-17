package assignment_day1;

import java.util.Scanner;

public class Searching_element_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Taking size input
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		// Taking array input
		for(int i = 0; i<size; i++) {
			arr[i] = s.nextInt();
		}
		// Take input of element that to be searched
		int element = s.nextInt();
		for (int i = 0; i<size; i++) {
			if (arr[i] == element) {
				System.out.println("Index of element is:" + i);
			}
		}
		

	}

}
