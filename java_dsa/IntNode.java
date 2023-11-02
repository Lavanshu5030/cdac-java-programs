// LinkedList

package java_dsa;

public class IntNode {
	private int data;
	private IntNode next;
	
	public IntNode(){
		this.data = 0;
		this.next = null;
	}
	
	public IntNode(int data) {
		this.data = data;
		this.next = null;
	}
	
	public void setData(int d) {
		this.data = d;
	}
	
	public void setNext(IntNode n) {
		next = n;
	}
	
	public int getData() {
		return data;
	}
	
	public IntNode getNext() {
		return next;
	}
	
}
