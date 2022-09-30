package mainPackage;

public class Queue {
	private ListenElement kopf;
	// private ListenElement tmp;
	// private boolean end = false;
	
	priority flag = priority.doom;

	public Queue(int wert) {
		kopf = new ListenElement(wert);

	}

	public Queue() {

	}

	public void enqueue(int wert) {
		if (kopf == null) {
			kopf = new ListenElement(wert);
		} else {
			kopf.add(new ListenElement(wert));
		}
	}
	
	//TATÜTATTA
	public void enqueue(Queue obj) {
		if (kopf == null) {
			kopf = new ListenElement(obj.front(), obj.flag);
		} else {
			kopf.add(new ListenElement(obj.front(), obj.flag));
		}
	}
	
	// TATÜTATA
	public void enqueue(int wert, priority flag) {
		if (kopf == null) {
			kopf = new ListenElement(wert, flag);
		} else {
			kopf.add(new ListenElement(wert, flag));
		}
	}

	public int dequeue() {
		int val = kopf.get();
		kopf = kopf.getNext();
		return val;

	}
	
	public boolean empty() {
		if(kopf == null) {
			return true;
		}
		return false;
	}
	
	public int front() {
		return kopf.get();
	}
	
	// TATÜTATA
	public String frontAnruf() {
		return "[ priority: " + kopf.flag + " | number: " + kopf.get() + " ]";
	}

	public String toString() {
		return kopf.toString();
	}
}
