package com.Start.Antonio;

import java.util.Random;

public class LuckGame {

	int numPlayer1 = 0;
	int numPlayer2 = 0;
	int randNumber = 0;
	
	
	Random r = new Random();
	
	public LuckGame(int numPlayer1, int numPlayer2) {
		this.numPlayer1 = numPlayer1;
		this.numPlayer2 = numPlayer2;
		
	}

	public boolean play() {
		randNumber = r.nextInt(100);
		if((numPlayer1 - randNumber) > (numPlayer2 - randNumber)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean checkAge(int age) {
		
		if(age >= 18) {
			return true;
		}else {
			return false;
		}
		
	}
	
}
