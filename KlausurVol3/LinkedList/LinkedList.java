package LinkedList;

public class LinkedList {
	Element head;
	
	
	
	public LinkedList(int data) {
		head = new Element(data);
	}
	
	public void add(int data) {
		head.add(new Element(data));
	}
	
	public void remove() {
		head.remove();
	}
	
	public int front() {
		return head.data;
	}
	
	public int end() {
		return head.end();
	}
	
	public String getAll() {
		String msg = head.getAll();
		Element.all ="";
		return msg;
	}
}