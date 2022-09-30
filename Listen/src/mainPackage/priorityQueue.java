package mainPackage;

public class priorityQueue {

	Queue doom;
	Queue is;
	Queue eternal;

	public priorityQueue() {
		doom = new Queue();
		is = new Queue();
		eternal = new Queue();

	}

	public void insert(Queue anruf) {

		switch (anruf.flag) {
		case doom:
			doom.enqueue(anruf);
			break;

		case is:
			is.enqueue(anruf);
			break;
		case eternal:
			eternal.enqueue(anruf);
			break;
			
		default:
			System.out.println("Fuck you toni");
			break;

		}

	}
	
	public void insert(int wert, priority flag) {

		switch (flag) {
		case doom:
			doom.enqueue(wert, flag);
			break;

		case is:
			is.enqueue(wert, flag);
			break;
		case eternal:
			eternal.enqueue(wert, flag);
			break;
			
		default:
			System.out.println("Fuck you toni");
			break;

		}

	}

	public void delete() {
		if (!doom.empty()) {
			doom.dequeue();
		} else if (!is.empty()) {
			is.dequeue();
		} else if (!eternal.empty()) {
			eternal.dequeue();
		}

	}

	public int max() {
		if (!doom.empty()) {
			return doom.front();
		} else if (!is.empty()) {
			return is.front();
		} else if (!eternal.empty()) {
			return eternal.front();
		} else {
			return 666;
		}
	}

	public String maxAnruf() {
		if (!doom.empty()) {
			return doom.frontAnruf();
		} else if (!is.empty()) {
			return is.frontAnruf();
		} else if (!eternal.empty()) {
			return eternal.frontAnruf();
		} else {
			return "Fuck you Toni";
		}
	}
	
	public boolean empty() {
		if (doom.empty() && is.empty() && eternal.empty()) {
			return true;
		}
		return false;

	}
}
