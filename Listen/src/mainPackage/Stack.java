package mainPackage;

public class Stack {
	private ListenElement kopf;
	private ListenElement tmp;
	
	public Stack(int wert) {
		kopf = new ListenElement(wert);
		
	}
	
	public void push(int wert) {
		tmp = kopf;
		kopf = new ListenElement(wert);
		kopf.add(tmp);
	}
	
	public int pop() {
		int val = kopf.get();
		kopf = kopf.getNext();
		return val;
	}
	
	public String toString() {
		return kopf.toString();
	}
}
