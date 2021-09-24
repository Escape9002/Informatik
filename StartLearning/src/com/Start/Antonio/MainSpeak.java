package com.Start.Antonio;


public class MainSpeak{

	
		
	public static void main(String[] args) {
		Player player1 = new Player();
		
		player1.catchData();
		System.out.println(player1.outputData());
		
	}

	public static int clamp(int INPUT, int min, int max) {

		if (INPUT < min) {
			INPUT = min;
		} else if (INPUT > max) {
			INPUT = max;
		}

		return INPUT;
	}
	
	
}

