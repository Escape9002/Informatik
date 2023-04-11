package Netzwerken;

public class PaketQueue<T> {
	Netzwerkpaket anfang = null;
	PaketQueue(Netzwerkpaket p){
		anfang = p;
	}
	
	void enqueue(Netzwerkpaket p){
		
	}
	
	Netzwerkpaket deqeue() {
		return anfang;
	}
	
	boolean isEmpty() {
		return false;
	}
}
