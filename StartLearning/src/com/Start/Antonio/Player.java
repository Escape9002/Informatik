package com.Start.Antonio;

import java.util.Scanner;

public class Player {

	 byte alter = 19; // 0 bis 120 (including)
	 byte geschlecht = 0; // 0 bis 3 (including)
	 String firstName = "Max";
	 String sirName = "Mustermann";
	 
	Scanner eingabe = new Scanner(System.in);
	
	Player(Glücksspiel glücksspiel, int GENDER, int AGE, String sirName, String firstName, byte alter, byte geschlecht) {
		this.alter = alter;
		this.geschlecht = geschlecht;
		this.firstName = firstName;
		this.sirName = sirName;
	}

	public String anrede(int GENDER, int AGE, String sirName, String firstName, Glücksspiel glücksspiel) {

		if (AGE >= 18) {
			if (Glücksspiel.clamp(GENDER, 0, 3) == 0) {
				return "Herr " + sirName;
			} else if (Glücksspiel.clamp(GENDER, 0, 3) == 1) {
				return "Frau " + sirName;
			} else if (Glücksspiel.clamp(GENDER, 0, 3) == 2) {
				return " " + sirName;
			} else {
				return "ERROR";
			}
		} else if (AGE < 18) {
			if (Glücksspiel.clamp(GENDER, 0, 3) == 0) {
				return " " + firstName;
			} else if (Glücksspiel.clamp(GENDER, 0, 3) == 1) {
				return " " + firstName;
			} else if (Glücksspiel.clamp(GENDER, 0, 3) == 2) {
				return " " + firstName;
			} else {
				return "ERROR";
			}
		} else {
			return "ERROR";
		}

	}
	

	private static String gender(int GENDER) {

		if (Glücksspiel.clamp(GENDER, 0, 3) == 0) {
			return "Herr ";
		} else if (Glücksspiel.clamp(GENDER, 0, 3) == 1) {
			return "Frau ";
		} else if (Glücksspiel.clamp(GENDER, 0, 3) == 2) {
			return " ";
		} else {
			return "ERROR";
		}
	}
	
	public void Abfrage() {
		System.out.println("Wie alt bist du?");
		alter = eingabe.nextByte();
		System.out.println("Welches Geschlecht bist du?");
		System.out.println("0=maennlich, 1=weiblich, 2=divers");
		geschlecht = eingabe.nextByte();
		System.out.println("Wie ist dein Vorname?");
		firstName = eingabe.next();
		System.out.println("Wie ist dein Nachname?");
		sirName = eingabe.next();

	}
}
