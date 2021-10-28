package com.AntonioRehwinkel.KlausurVol1;
public class Hund {

	String rasse;
	
	String name;
	int alter;
	double lautstaerkeDB;

	public Hund(String name, int alter, double lautstaerkeDB) {
		this.name = name;
		this.alter = alter;
		this.lautstaerkeDB = lautstaerkeDB;
	}
	
	public Hund(String name, int alter) {
		this(name, alter, 5.00);
	}

	public Hund(String name) {
		this(name, 13, 123.8);
	}

	public Hund() {
		this("Rudolf");
	}

	public String getAllData() {
		return rasse + " | " + name + " | " + alter + " | " + lautstaerkeDB;
	}

	public double getLautstaerkeDB() {
		return lautstaerkeDB;
	}

}