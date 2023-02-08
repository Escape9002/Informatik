package com.AntonioRehwinkel.KlausurVol1;

public class TierparkBerlin {

	public static void main(String[] args) {
		
		Hund hund = new Hund("Fredy", 18,5.0);
		Schaeferhund SH = new Schaeferhund("ahd", 16, 5.0);
		Chihauha FuszHupe = new Chihauha("Fuck", 1 , 5.0);
		
		Besitzer Franz = new Besitzer(SH, ID.Besitzer, 25, "Franzie" );
		
		System.out.println(hund.getAllData());
		System.out.println(SH.getAllData());
		System.out.println(FuszHupe.getAllData());
		
		System.out.println(SH.getLautstaerkeDB());
		System.out.println(FuszHupe.getLautstaerkeDB());
		
		System.out.println(Franz.getBack());

	}

}
