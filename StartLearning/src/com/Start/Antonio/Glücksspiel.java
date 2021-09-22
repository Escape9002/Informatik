package com.Start.Antonio;

import java.util.Random;

public class Glücksspiel {

	static byte alter = 18;
	static byte geschlecht = 0;
	static String firstName = "Max";
	static String sirName = "Mustermann";
	static int zufall = 0;
		
	public static void main(String[] args) {
		Random r = new Random();
		
		alter = (byte) r.nextInt(255);
		
		System.out.println("Alter: " + clamp(alter, 0, 120));
		System.out.println("Geschlecht: " + gender(geschlecht));
		System.out.println("Hallo " + anrede(geschlecht, alter));
	}

	private static int clamp(int INPUT, int min, int max) {

		if (INPUT < min) {
			INPUT = min;
		} else if (INPUT > max) {
			INPUT = max;
		}

		return INPUT;
	}

	private static String anrede(int GENDER, int AGE) {

		if (AGE >= 18) {
			if (clamp(GENDER, 0, 3) == 0) {
				return "Herr " + sirName;
			} else if (clamp(GENDER, 0, 3) == 1) {
				return "Frau " + sirName;
			} else if (clamp(GENDER, 0, 3) == 2) {
				return " " + sirName;
			} else {
				return "ERROR";
			}
		} else if (AGE < 18) {
			if (clamp(GENDER, 0, 3) == 0) {
				return " " + firstName;
			} else if (clamp(GENDER, 0, 3) == 1) {
				return " " + firstName;
			} else if (clamp(GENDER, 0, 3) == 2) {
				return " " + firstName;
			} else {
				return "ERROR";
			}
		} else {
			return "ERROR";
		}

	}

	private static String gender(int GENDER) {

		if (clamp(GENDER, 0, 3) == 0) {
			return "Herr ";
		} else if (clamp(GENDER, 0, 3) == 1) {
			return "Frau ";
		} else if (clamp(GENDER, 0, 3) == 2) {
			return " ";
		} else {
			return "ERROR";
		}
	}

}