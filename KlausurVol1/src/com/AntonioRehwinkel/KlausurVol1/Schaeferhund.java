package com.AntonioRehwinkel.KlausurVol1;

public class Schaeferhund extends Hund {
	
	public Schaeferhund(String name, int alter, double laustraerkeDB){
		super(name,  alter, laustraerkeDB);
		this.rasse = "schaeferhund";
	}
	
	
	 @Override public String getAllData() {
		return super.getAllData() + " | " + rasse;
	}
	 
	 @Override public double getLautstaerkeDB(){
			return 1.5*super.lautstaerkeDB;
		}
}
