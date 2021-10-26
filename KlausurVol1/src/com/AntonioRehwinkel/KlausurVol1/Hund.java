package com.AntonioRehwinkel.KlausurVol1;
public class Hund {

	String rasse;
	String name;
	int alter;
	double lautstaerkeDB;

	public Hund(String rasse, String name, int alter, double lautstaerkeDB) {
		this.rasse = rasse;
		this.name = name;
		this.alter = alter;
		this.lautstaerkeDB = lautstaerkeDB;
	}

	public Hund(String name) {
		this("Standarbd", name, 13, 123.8);
	}

	public Hund() {
		this("Rudolf");
	}

	public String getAllData() {
		return rasse + " | " + name + " | " + alter + " | " + lautstaerkeDB;
	}

	public double wuff() {
		return lautstaerkeDB;
	}

	public static void main(String[] args) {
		Hund hund = new Hund("laprador", "gandalf", 16, 5);
		Schaeferhund hund2 = new Schaeferhund("ahd", 16, 5, 5);

		System.out.println(hund.getAllData());
		System.out.println(hund2.getAllData());

		System.out.println("Hund " + hund.wuff());
		System.out.println("Schaferhund " + hund2.wuff());
	}

}