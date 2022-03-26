package Visuals;
import GameMain.GameMain;

import java.awt.Color;
import java.awt.Graphics;

import Entities.Ball;
import Entities.GameObject;
import Entities.ID;
import Entities.leftWall;
import Entities.rightWall;

public class HUD {
	
	public static byte lost = 0; // wer hat einen Punkt gemacht? 
	
	
	private  int score1 = 0;	// Spieler Cyan, Punkteanzahl
	private  int score2 = 0;	// Spieler Green, Punkteanzahl
	

	public void tick() {
		switch(lost) {
		case 1:			//	spieler 2 lies Ball passieren
			score1++;	// Spieler 1 sorred
			
			break;
			
		case 2:		//	spieler 1 lies Ball passieren
			score2++;	// Spieler 1 sorred
			
			break;
		case 0:	// default stance
			break;
		}
	}
	
	public void render(Graphics g) {
		/*
		 * erzuge Textfelder und zeige Punktzahl an.
		 */
		g.setColor(Color.CYAN);
		g.drawRect(10, 10, 100, 30);
		
		g.drawString("Score: " + score1, 30, 30);
		
		g.setColor(Color.GREEN);
		g.drawRect(GameMain.WIDTH-GameMain.WIDTH/5, 10, 100, 30);
		
		g.drawString("Score: " + score2, GameMain.WIDTH-GameMain.WIDTH/6, 30);
		
	}
	
	/*
	 * folgend Getter und Setter der wichtigsten Variablen
	 */
	public void setScore1(int score) {
		this.score1 = score;
	}
	
	public void setScore2(int score) {
		this.score2 = score;
	}
	
	public int getScore1(){
		return score1;
	}
	
	public int getScore2(){
		return score2;
	}
	
	public void setLost(byte b) {
		HUD.lost = b;
	}
	
	
}
