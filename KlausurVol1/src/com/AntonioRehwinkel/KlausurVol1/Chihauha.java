package com.AntonioRehwinkel.KlausurVol1;

public class Chihauha extends Hund {

	public Chihauha(String name, int alter, double laustraerkeDB) {
		super(name, alter, laustraerkeDB);
		this.rasse = "Chihauha";
	}
	
	@Override public double getLautstaerkeDB() {
		return super.lautstaerkeDB * 9000;
	}

	@Override
	public String getAllData() {
		return super.getAllData() + " | " + rasse;
	}

}
