package java_dsa;

public class NodeStack {
	private int data;
	private NodeStack next;
	
//	public NodeStack() {
//		this.data = 0;
//		this.next = null;
//	}
	
	public NodeStack(int data) {
		this.data = data;
		this.next = null;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	
	public void setNext(NodeStack next) {
		this.next = next; 
	}
	
	public NodeStack getNext() {
		return next;
	}

}
