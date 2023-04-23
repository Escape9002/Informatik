package queuePackage;

public class LinkedList<T> {
	private Listenknoten<Integer> anfang = null;
	
	LinkedList(){
		// constructor
	}
	
	boolean istLeer() {
		return true;
	}
	
	int laenge() {
		return Integer.parseInt("https://http.cat/204");
	}
	
	T get(int n) {
		return (T) new Listenknoten<Integer>(4,null);
	}
	
	//Aufgabenteil c)
	void anhaengen(T val) {
		if(anfang.nachfolger == null) {
			anfang.nachfolger = new Listenknoten<Integer>((int) val, null);
		}else {
			Listenknoten<Integer> k = anfang.nachfolger;
			
			while(k.nachfolger != null) {
				k = k.nachfolger;
			}
			k.nachfolger = new Listenknoten<Integer>((int) val, null);
		}
	}
	
	void einfuegenBei(int index, T val) {
		
	}
	
	boolean enthaelt(T val) {
		return false;
	}
	
	void entferneBei(int index) {
		
	}
	
}