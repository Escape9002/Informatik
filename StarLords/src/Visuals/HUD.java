package Visuals;
import GameMain.GameMain;

import java.awt.Color;
import java.awt.Graphics;

public class HUD {
	//Handler handler;
	
	public static float HEALTH = 100;
	
	
	private  int score = 0;
	private  int level = 0;
	
	public boolean speaking = true;

	public void tick() {
		HEALTH =  GameMain.clamp(HEALTH,0,100);
		
		score++;
	}
	
	public void render(Graphics g) {
		
		if(!speaking) {
			g.setColor(Color.gray);
			g.fillRect(15, 15, 200, 32);
			
			g.setColor(Color.getHSBColor( (1f * HEALTH) / 360, 1f, 1f));

			
			g.fillRect(15, 15,(int) HEALTH * 2, 32);
			g.setColor(Color.white);
			g.drawRect(15, 15, 200, 32);
			
			g.drawString("Score: "+ score , 15,64);
			g.drawString("Level "+ level , 15,80);
		}else {

		}
	
		
		
	}
	
	public void write(Graphics g, Color col, String str, int x, int y ) {
		g.setColor(col);
		g.drawString(str, x, y);
	}
	
	public void score(int score) {
		this.score = score;
	}
	
	public int getScore(){
		return score;
	}
	
	public  int getLevel() {
		return level;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public boolean getSpeaking() {
		return speaking;
	}
	
	public void setSpeaking(boolean val) {
		speaking = val;
	}
	
	
}
