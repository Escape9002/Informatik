package com.Start.Antonio;
import java.util.Random;

public class Glücksspiel {

	static int zufall = 0;
		
	public static void main(String[] args) {
		Random r = new Random();
		
	}

	public static int clamp(int INPUT, int min, int max) {

		if (INPUT < min) {
			INPUT = min;
		} else if (INPUT > max) {
			INPUT = max;
		}

		return INPUT;
	}
	
	private static String luckyGame(Random r) {
		
		if(r.nextInt(100) <= 50) {
			return "WIN!";
		}else if(r.nextInt(100) > 50) {
			return "LOOSE!";
		}else {
			return "ERROR";
		}
		
		
		
	}
}

