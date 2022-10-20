package LinkedList;

public class LinkedList implements LinkedListInterface {
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

	public Element getNext(){
		return head.getNext();
	}

	public boolean isEmpty(){
		if(head == null){
			return true;
		}else{
			return false;
		}
	}

	public int getData() {
		return head.getData();
	}


}