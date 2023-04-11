package queuePackage;

public class QueueWithList<T> extends Queue<T> {
	LinkedList<T> dieEineWahreListe = new LinkedList<T>();
	
	public QueueWithList(){
		// constructor
	}

	@Override
	boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	// Aufgabenteil b)
	@Override
	void enqueue(T t) {
		dieEineWahreListe.anhaengen(t);
		
	}

	@Override
	T dequeue() {
		T val = dieEineWahreListe.get(0);
		dieEineWahreListe.entferneBei(0);
		return val;
	}

	@Override
	T front() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
