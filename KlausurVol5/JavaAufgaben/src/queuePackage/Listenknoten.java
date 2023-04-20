package queuePackage;

// Aufgaben Teil a)
public class Listenknoten<T> {
	Listenknoten<Integer> nachfolger;
	int daten;
	
	Listenknoten(int daten, Listenknoten<Integer> nachfolger){
		this.daten = daten;
		this.nachfolger = nachfolger;
	}
}
