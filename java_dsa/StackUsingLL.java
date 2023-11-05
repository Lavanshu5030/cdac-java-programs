package java_dsa;

import java.util.Scanner;

public class StackUsingLL {
	private NodeStack top;
	
	public StackUsingLL() {
		this.top = null;
	}
	
	public void push(int data) {
		NodeStack new_node = new NodeStack(data);
		if (top == null) {
			top = new_node;
			return;
		}
		//top.setNext(new_node);     //Doubt
		new_node.setNext(top);
		top = new_node;
		return;
	}
	
	public boolean isEmpty() {
		if (top == null){
			//System.out.println("Stack is empty");
			return true;
		}
		else {
			return false;
		}
	}
	
	public int pop(){
		if(isEmpty()) {
			System.out.println("Stack is Empty...you can not pop element");
			return -999;
		}
		else {
			int data = top.getData();
			top = top.getNext();
			return data;
		}
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return -99;
		}
		else {
			int value = top.getData();
			return value;
		}
	}
	
	
	public void printStackUsingLL() {
		NodeStack itr = top;
		while(itr != null) {
			System.out.print(itr.getData() + "->");
			itr = itr.getNext();
		}
		System.out.println();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingLL s= new StackUsingLL();
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		
		do {
			System.out.println("Enter 1 to push element");
			System.out.println("Enter 2 to pop element");
			System.out.println("Enter 3 to peek element");
			System.out.println("Enter 4 to print stack using linkedlist");
			System.out.println("Enter 5 to exit menu");
			System.out.println("Enter your choice:");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter element");
				int element = sc.nextInt();
			    s.push(element);
			    break;
			    
			case 2:
				System.out.println("Popped element " + s.pop());
				break;
				
			case 3:
				System.out.println("Peeked element " + s.peek());
				break;
				
			case 4:
				s.printStackUsingLL();
				break;
				
			case 5:
				break;
				
			default:
				System.out.println("Invalid choice");
				
			}
		}while(choice != 5);
	}
}
