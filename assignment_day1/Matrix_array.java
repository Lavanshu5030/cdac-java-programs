package assignment_day1;

import java.util.Scanner; // imported Scanner Class

public class Matrix_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Class to input from user
		Scanner s = new Scanner(System.in);
		System.out.println("Enter row size:");
		int row_size = s.nextInt();
		System.out.println("Enter col size");
		int col_size = s.nextInt();
		
		// Declare Matrix array
		int arr[][] = new int[row_size][col_size];
		// Taking matrix input
		System.out.println("Enter elements of matrix");
		for (int i = 0; i<row_size; i++) {
			for (int j = 0; j<col_size; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		System.out.println("Print elements of matrix");
		for (int i = 0; i<row_size; i++) {
			for (int j = 0; j<col_size; j++) {
                System.out.print(arr[i][j] + "  "); 
			}
            System.out.println();
		}
		
	}

}
