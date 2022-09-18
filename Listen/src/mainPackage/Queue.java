package mainPackage;

public class Queue {
	private ListenElement kopf;
	private ListenElement tmp;
	private boolean end = false;

	public Queue(int wert) {
		kopf = new ListenElement(wert);

	}

	public void enqueue(int wert) {

		while (end == false) {
			if (kopf.getNext() == null) {
				kopf.add(new ListenElement(wert));
				end = true;
			} else {
				kopf = kopf.getNext();
				end = false;
			}
		}
	}

	public void dequeue() {
	
		kopf = kopf.getNext();
		
	}

	public String toString() {
		return kopf.toString();
	}
}
