package com.AntonioRehwinkel.KlausurVol1;

public class Besitzer {
	
	String name;
	ID id;
	int alter;
	Hund hund;
	
	public Besitzer(Hund hund, ID id, int alter, String name) {
		this.name = name;
		this.alter = alter;
		this.id = id;
		this.hund = hund;
	}
	
	public Besitzer(Hund hund, ID id, int alter) {
		this( hund, id, alter, "Franzie");
	}
	
	public Besitzer(Hund hund, ID id) {
		this(hund, id, 25);
	}
	
	public String getAllData() {
		return hund + " | " + name + " | " + id + " | " + alter;   
	}
	
	public String getBack() {
		return "komm zurück" + hund.getAllData();
	}
}
