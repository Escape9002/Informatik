package mainPackage;

public class ArrayQueue {
	private int[] queue;
	private byte end;
	// private int start;

	public ArrayQueue() {
		queue = new int[100];

		end = -1;
	}

	public void enqueue(int wert) {
		end++;
		queue[end] = wert;
	}

	public void dequeue() {
		if (!empty()) {

			for (int i = 0; i <= end; i++) {
				queue[i] = queue[i+1];
				//System.out.println(queue[i]);
			}
			end--;
		}
		
	}

	public int front() {
		if(!empty())
			return queue[0];
		return 42069;
	}

	public boolean empty() {
		if (end == -1) {
			return true;
		} else {
			return false;
		}
	}
	
	public void concat(ArrayQueue q) {
		ArrayQueue tmp = new ArrayQueue();
		while(!q.empty()) {
			enqueue(q.front());
			tmp.enqueue(q.front());
			q.dequeue();
		}
		
		while(!tmp.empty()) {
			q.enqueue(tmp.front());
			tmp.dequeue();
		}
	

	}
}
