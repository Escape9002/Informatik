package com.Start.Antonio;

public class MainSpeak  {

	public static void main(String[] args) {
		
		Player player1 = new Player();
		Player player2 = new Player();

		player1.catchData();
		System.out.println(player1.outputData());

		player2.catchData();
		System.out.println(player2.outputData());

		LuckGame game = new LuckGame(player1.getLuckyNumber(), player2.getLuckyNumber());

		if (LuckGame.checkAge(player1.getAge())) {
			if (LuckGame.checkAge(player2.getAge())) {
				if (game.play()) {
					System.out.println(player1.getFirstName() + " won!");
				} else {
					System.out.println(player2.getFirstName() + " won!");
				}

			} else {
				System.out.println(player2.getFirstName() + " is too young");
				System.exit(0);
			}
		} else {
			System.out.println(player1.getFirstName() + " is too young");
			System.exit(0);
		}

	}

}
