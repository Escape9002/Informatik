package com.AntonioRehwinkel.KlausurVol1;

public class Schaeferhund extends Hund {

int lel = 0;	
	
	public Schaeferhund(String name, int alter, double laustraerkeDB, int lel){
		super("Schäferhund", name,  alter, laustraerkeDB*1.5);
		
		this.lel = lel;
	}
	
	public String getAllData() {
		return super.getAllData() + " | " +  lel;
	}
}
