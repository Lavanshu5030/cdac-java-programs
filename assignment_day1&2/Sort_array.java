//4. Write a java program to sort all elements in an array.

package assignment_day1;

import java.util.Scanner;

public class Sort_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		// Taking array input
		for(int i = 0; i<size; i++) {
			arr[i] = s.nextInt();
		}
		for (int i = 0; i<size; i++) {
			for (int j = i+1; j<size; j++) {
				if (arr[i] > arr[j]) {
					// Swapping
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		// Printing after sorting
		for (int i = 0; i<size; i++) {
			System.out.print(arr[i]+ " ");
		}
		

	}

}
