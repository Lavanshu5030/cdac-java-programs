package assignment_day1;

import java.util.Scanner;

public class Largest_element_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i<size; i++) {
			arr[i] = s.nextInt();
		}
		int max = arr[0];
		for (int i = 0; i<size; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Largest element: " + max);
		

	}

}
