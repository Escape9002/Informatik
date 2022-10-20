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

	public Element getNext(){
		return head.getNext();
	}
	
	public int end() {
		return head.end();
	}
	
	public String getAll() {
		String msg = head.getAll();
		Element.all ="";
		return msg;
	}

	public boolean isEmpty(){
		if(head == null){
			return true;
		}else{
			return false;
		}
	}


}