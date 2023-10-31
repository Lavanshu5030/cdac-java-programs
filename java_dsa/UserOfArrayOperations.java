package java_dsa;

import java.util.Scanner;

//	private int arr[];
	
//	public ArrayOperations() {
//		arr = new int[5];
//	}
	
//	public ArrayOperations(int s) {
//		arr = new int[s];
//	}
	
	
	
//	public void printArray() {
//		for (int i = 0; i<arr.length; i++) {
//			System.out.println(" " + arr[i]);
//		}
//	}
	


public class UserOfArrayOperations {

	public static int[] readArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an Array:");
		int size = sc.nextInt();
		System.out.println("Enter array elements");
		int arr[] = new int[size];
		for (int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;

	}
	
	public static void printArray(int arr[]) {
		System.out.println("Printed the array");
		for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static int[] leftShift(int arr[]) {
		int i;
		for (i = 0; i<arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[i] = 0;
		return arr;
	}
	
	public static int[] rightShift(int arr[]) {
		int i;
		for (i = arr.length-1; i>0; i--) {
			arr[i] = arr[i-1];
		}
		arr[i] = 0;
		return arr;
	}
	
	public static int[] leftRotate(int arr[]) {
		int i;
		int temp = arr[0];
		for (i = 0; i<arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[i] = temp;
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//ArrayOperations obj = new ArrayOperations();
		int arr[] = null;
		int choice = 0;

		do {
			System.out.println("------Menu------");
			System.out.println("Enter 1 to take array input");
			System.out.println("Enter 2 to print array");
			System.out.println("Enter 3 to leftshift array");
			System.out.println("Enter 4 to RightShift array");
			System.out.println("Enter 5 to RightShift array");
			System.out.println("Enter your choice");
			choice = sc.nextInt();

			switch(choice) {
			case 1:
				arr = readArray();
				break;
				
			case 2:
				printArray(arr);
				break;
				
			case 3:
				arr = leftShift(arr);
				break;
				
			case 4:
				arr = rightShift(arr);
			
			case 5:
				arr = leftRotate(arr);
				break;
				
			case 6:
				break;
				
			default:
				System.out.println("Invalid choice");
			}

		}while(choice != 6);


	}

}
