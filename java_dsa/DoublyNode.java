package java_dsa;

public class DoublyNode {
	private int data;
	private DoublyNode prev,next;
	
	public DoublyNode() {
		data = 0;
		prev = next = null;
	}
	
	public DoublyNode(int d) {
		this.data = d;
		prev = next = null;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public void setNext(DoublyNode next) {
		this.next = next;	
	}
	
	public void setPrev(DoublyNode prev) {
		this.prev = prev;
	}
	
	public int getData() {
		return data;
	}
	
	public DoublyNode getNext() {
		return next;
	}
	
	public DoublyNode getPrev() {
		return prev;
	}	
}


