package mainPackage;

public class Queue {
	private ListenElement kopf;
	private ListenElement tmp;
	private boolean end = false;

	public Queue(int wert) {
		kopf = new ListenElement(wert);

	}

	public void enqueue(int wert) {
		kopf.add(new ListenElement(wert));
	}

	public int dequeue() {
		int val = kopf.get();
		kopf = kopf.getNext();
		return val;

	}

	public String toString() {
		return kopf.toString();
	}
}
