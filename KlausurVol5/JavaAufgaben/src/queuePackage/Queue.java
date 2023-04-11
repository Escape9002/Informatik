package queuePackage;

public abstract class Queue<T> {
	
	abstract boolean isEmpty();

	abstract void enqueue(T t);

	abstract T dequeue();

	abstract T front();
}
