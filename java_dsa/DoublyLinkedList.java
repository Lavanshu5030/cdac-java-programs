package java_dsa;

import java.util.Scanner;

public class DoublyLinkedList {
	private DoublyNode head;
	
	public DoublyLinkedList() {
		head = null;
	}
	
	public void insert_first(int d) {
		DoublyNode new_node = new DoublyNode(d);
		
		if(head == null) {
			head = new_node;
			return;
		}
		head.setPrev(new_node);
		new_node.setNext(head);
		head = new_node;
		return;
	}
	
	public void insert_last(int d) {
		DoublyNode new_node = new DoublyNode(d);
		if(head == null) {
			head = new_node;
			return;
		}
		DoublyNode iter = head;
		while(iter.getNext() != null) {
			iter = iter.getNext();
		}
		new_node.setPrev(iter);
		iter.setNext(new_node);
		return;
	}
	// Have not handle insert at position 4 if total elements are 3
	public void insert_by_pos(int data, int pos) {
		DoublyNode new_node = new DoublyNode(data);
		
		if (head == null) {
			head = new_node;
			return;
		}
		if (pos == 1) {
			//head.setPrev(new_node);
			new_node.setNext(head);
			head = new_node;
			return;
		}
		DoublyNode itr = head;
		int i = 1;
		while((i<pos-1) && (itr.getNext() != null)) {
			itr = itr.getNext();
			i++;
		}
		new_node.setPrev(itr);
		new_node.setNext(itr.getNext());
		itr.setNext(new_node);
		new_node.getNext().setPrev(new_node);;
		return;
	}
	
	public int delete_first() {
		DoublyNode deletable;
		if (head == null) {
			System.out.println("List is empty");
			return -999;
		}
		if(head.getNext() == null) {
			deletable = head;
			int d = deletable.getData();
			head .setPrev(null);
			head.setNext(null);
			head = head.getNext();
			deletable = null;
			return d;
			
		}
		deletable = head;
		int d = deletable.getData();
		head = head.getNext();
		head .setPrev(null);
		head.setNext(null);
		deletable = null;
		return d;
	}
	
	public int delete_last() {
		DoublyNode deletable;
		int d =0;
		if (head == null) {
			System.out.println("List is empty");
			return -999;
		}
		if (head.getNext() == null) {
			deletable = head;
			d = deletable.getData();
			head.setPrev(null);
			head = head.getNext();
			deletable = null;
			return d;
				
		}
		DoublyNode itr = head;
		while(itr.getNext() != null) {
			itr = itr.getNext();
		}
		deletable = itr;
		d = deletable.getData();
		itr.getPrev().setNext(null);
		deletable = null;
		return d;
	}
	
	public int delete_by_pos(int pos) {
		DoublyNode deletable;
		int d = 0;
		
		if (head == null) {
			System.out.println("List is empty...");
//			return;
		}
		if (pos == 1) {
			if(head.getNext() == null) {
				deletable = head;
				d = deletable.getData();
				head .setPrev(null);
				head.setNext(null);
				head = head.getNext();
				deletable = null;
				return d;
			}
			deletable = head;
			d = deletable.getData();
			head = head.getNext();
			deletable.setNext(null);
			head.setPrev(null);
			deletable = null;
			return d;
		}
		DoublyNode iter = head;
		int i = 1;
		while((i<pos-1) && (iter.getNext()!= null)) {
			iter = iter.getNext();
			i++;
		}
		if(iter.getNext() == null) {
			System.out.println("position Invalid");
			return -999;
		}
		deletable = iter.getNext();
		iter.setNext(deletable.getNext());
		deletable.getNext().setPrev(iter);
		deletable.setPrev(null);
		deletable.setNext(null);
		d = deletable.getData();
		deletable = null;
		return d;
	}
	
	public void printDoublyList() {
		DoublyNode itr = head;
		while(itr != null) {
			System.out.print(itr.getData() + "->");
			itr = itr.getNext();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoublyLinkedList dl = new DoublyLinkedList();
		Scanner s = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("Enter 1 to insert element at first");
			System.out.println("Enter 2 to insert element from last");
			System.out.println("Enter 3 to insert element by position");
			System.out.println("Enter 4 to delete first element");
			System.out.println("Enter 5 to delete last element");
			System.out.println("Enter 6 to delete by postion");
			System.out.println("Enter 8 to print doubly linked list");
			System.out.println("Enter 9 to exit menu");
			System.out.println("Enter your choice:");
			choice = s.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter element");
				int data = s.nextInt();
				dl.insert_first(data);
				break;
				
			case 2:
				System.out.println("Enter element");
				int value = s.nextInt();
				dl.insert_last(value);
				break;
				
			case 3:
				System.out.println("Enter element and position");
				int value_pos = s.nextInt();
				int pos = s.nextInt();
				dl.insert_by_pos(value_pos, pos);
				break;
				
			case 4:
				System.out.println("Deleted first");
				System.out.println(dl.delete_first());
				break;
				
			case 5:
				System.out.println("Deleted Last");
				System.out.println(dl.delete_last());
				break;
				
			case 6:
				System.out.println("Enter position");
				int pos_del = s.nextInt();
				System.out.println(dl.delete_by_pos(pos_del));
				break;
				
			case 8:
				dl.printDoublyList();
				break;
				
			case 9:
				break;
			}
			
		}while(choice != 9);
	}
}