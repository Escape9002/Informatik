package LinkedList;

public class Element {
	Element next;
	int data;
	static String all = "";

	public Element(int data) {
		this.data = data;
	}
	
	public int end() {
		if(next != null) {
			return next.end();
		}else {
		return data;
		}
	}

	public int getData() {
		return data;
	}

	public Element getNext(){
		return next;
	}

	public void setData(int data) {
		this.data = data;
	}

	public void add(Element el) {
		if (next != null) {
			next.add(el);
		} else {
			next = el;
		}
	}

	public boolean remove() {

		if (next != null) {
			if (next.remove()) {
				next = null;
			}
		} else {
			return true;
		}
		return false;
	}
	
	public String getAll() {
		if(next != null) {
			all = all + data + " | ";
			next.getAll();
		}else {
			all = all + data;
		}
		
		
		return all;
	}

	public String toString(){
		if(next == null){
			return "" + data;
		}else{
			return "" + data + " | " + next.toString();
		}
	}
	
}