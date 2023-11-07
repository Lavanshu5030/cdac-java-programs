package java_dsa;

import java.util.Scanner;

public class StudentStackMain {
	private StudentStack arr[];
	private int top;
	
	public StudentStackMain() {
		this.arr = new StudentStack[10];
		this.top = -1;
	}
	
	public int size() {
		return top+1;
	}
	
	public void push(StudentStack data) {
		if(top < arr.length) {
		top++;
		arr[top] = data;
		}
		else {
			System.out.println("Stack is full");
		}
		
	}
	
	public boolean isEmpty(){
		if (top == -1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public StudentStack pop() {
		if(isEmpty() == true) {
			System.out.println("Stack is empty you can not pop out");
			return null;
		}
		else {
			StudentStack value = arr[top];
			top--;
			return value;
		}
	}
	
	public StudentStack peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty... No element peek");
			return null;
		}
		else {
			return arr[top];
		}
	}
	
	public void displayStack() {
		for (int i = top; i >= 0; i--) {
			System.out.println(arr[i]);
		}
		System.out.println();		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentStackMain s1 = new StudentStackMain();
		Scanner s = new Scanner(System.in);
//		s1.push(new StudentStack("Kushal", 27));
//		s1.push(new StudentStack("lavanshu",22));
//		System.out.println("Popped Element:" + s1.pop());
//		System.out.println(s1.size());
//		System.out.println(s1.peek());
		//s1.displayStack();
		int choice = 0;
		do {
			System.out.println("---Operations to Perform on user defined stack----");
			System.out.println("Enter 1 to push an object");
			System.out.println("Enter 2 to Pop out object");
			System.out.println("Enter 3 to Peek an object");
			System.out.println("Enter 4 to display the list");
			System.out.println("Enter 5 to exit menu");
			System.out.println("Enter your choice:");
			choice = s.nextInt();
			
			switch(choice) {
			case 1:
				String name = null;
				int age = 0;
				System.out.println("Enter name");
				s.nextLine();
				name = s.nextLine();
				System.out.println("Enter age");
				age = s.nextInt();
				s1.push(new StudentStack(name, age));
				break;
				
			case 2:
				System.out.println("Popped object:" + s1.pop());
				break;
				
			case 3:
				System.out.println("Peeked Element:" + s1.peek());
				break;
				
			case 4:
				s1.displayStack();
				break;
				
			case 5:
				break;
				
			default:
				System.out.println("Invalid choice");
			}
				
		}while(choice != 6);
		
	}

}
