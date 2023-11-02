package java_dsa;

import java.util.Scanner;

public class LinkedList {
	private IntNode head;
	
	public LinkedList() {
		head = null;
	}
	
	public void insert_first(int data) {
		IntNode new_node = new IntNode(data);
		//IntNode itr = head;
		
		if (head == null) {
			head = new_node;
			return;
		}
		else {
			new_node.setNext(head);
			head = new_node;
			return;
			
		}
	}
	
	public int delete_first() {
		if (head == null) {
			System.out.println("LinkedList is Empty");
			return -999;
		}
		int d = head.getData();
		head = head.getNext();
		return d;
	}
	
	public void insert_last(int d) {
		IntNode new_node = new IntNode(d);
		if (head == null) {
			head = new_node;
			return ;
		}
		IntNode itr = head;
		while(itr.getNext() != null) {
			itr = itr.getNext();
		}
		itr.setNext(new_node);
		return;
	}
	
	public int delete_last() {
		if (head == null) {
			System.out.println("LinkedList is empty");
			return -999;
		}
		if (head.getNext() == null) {
			int d = head.getData();
			head = head.getNext();
			return d;
		}
		IntNode itr = head;
        while (itr.getNext().getNext() != null) {
            itr = itr.getNext();
        }

        int deletedValue = itr.getNext().getData();
        itr.setNext(null); // Remove the last node
        return deletedValue;
	}
	
	public int delete_by_pos(int pos) {
		IntNode deletable;
		int d;
		
		if (head == null) {
			System.out.println("List is Empty");
			return -999;
		}
		if (pos == 1) {
			deletable = head;
			head = head.getNext();
			d = deletable.getData();
			deletable = null;
			return d;
		}
		if (head.getNext() == null) {
			System.out.println("Invalid position");
			return -999;
		}
		IntNode itr = head;
		int i = 1;
		while((i < pos-1) && (itr.getNext() != null)) {
            itr = itr.getNext();			
			i++;
		}
		if (itr.getNext() == null) {
			System.out.println("Position exceeds");
			return -999;
		}
		deletable = itr.getNext();
		d = deletable.getData();
		itr.setNext(deletable.getNext());
		return d;
	
	}
	
	public void printLinkedList() {
		IntNode itr = head;
		while(itr != null) {
			System.out.print(itr.getData() + "->");
			itr = itr.getNext();
		}
		System.out.println();
	}
	
	public void insert_by_pos(int d, int pos) {
		IntNode new_node = new IntNode(d);
		if (head == null) {
			head = new_node;
			return;
		}
		
		if (pos == 1) {
			new_node.setNext(head);
			head = new_node;
			return;
		}
		IntNode itr = head;
		int i = 1;
		for(; i<pos-1 && itr.getNext() != null; i++) {
			itr = itr.getNext();
		}
		new_node.setNext(itr.getNext());
		itr.setNext(new_node);
		//return;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList obj = new LinkedList();
		Scanner s = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("------Menu of linkedlist operatoins------");
			System.out.println("Enter 1 to insert element at first");
			System.out.println("Enter 2 to insert element at last");
			System.out.println("Enter 3 to insert element by position");
			System.out.println("Enter 4 to delete first element");
			System.out.println("Enter 5 to delete last element");
			System.out.println("Enter 6 to delete element by position");
			System.out.println("Enter 7 to print linkedlist");
			System.out.println("Enter 8 to exit menu");
			
			System.out.println("Enter your choice:");
			choice = s.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter element to insert");
				int value = s.nextInt();
				obj.insert_first(value);
				break;
				
			case 2:
				System.out.println("Enter element to insert");
				int data = s.nextInt();
				obj.insert_last(data);
				break;
				
			case 3:
				System.out.println("Enter element to insert");
				int d = s.nextInt();
				System.out.println("Enter position");
				int pos = s.nextInt();
				obj.insert_by_pos(d, pos);
				break;
				
			case 4:
				System.out.println("Deleted element");
			    System.out.println(obj.delete_first());
			    break;
			    
			case 5:
				System.out.println("Deleted element");
				System.out.println(obj.delete_last());
				break;
			
			case 6:
				System.out.println("Enter the position");
				int pos_del = s.nextInt();
				System.out.println("Deleted element");
				System.out.println(obj.delete_by_pos(pos_del));
				break;
	
			case 7:
				obj.printLinkedList();
				break;
				
			case 8:
				break;
			}
			
		}while(choice != 8);



	





		
		//You can call print function only one time...because after printing the LinkedList 
		// itr becomes null:
		


	}

}
