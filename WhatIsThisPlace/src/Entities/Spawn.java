package Entities;
import Visuals.*;
import music.MusicPlayer;
import GameMain.GameMain;

import java.util.Random;

public class Spawn {
	
	private Handler handler;
	private HUD hud;
	private Random r = new Random();
	
	private int scoreKeep = 0;
	
	public Spawn(Handler handler, HUD hud) {
		this.handler = handler;
		this.hud = hud;
		

	}
	
	public void tick() {
		
		scoreKeep++;
		
		if(scoreKeep >=500 ) {
			scoreKeep = 0;
			hud.setLevel(hud.getLevel() + 1);
			
			
			
				
				switch (hud.getLevel()) {
				case 2: 
					
					handler.addObject(new BasicEnemy(r.nextInt(GameMain.WIDTH - 50),r.nextInt(GameMain.HEIGHT - 50),ID.BasicEnemy));
					break;
					
				case 3: handler.addObject(new BasicEnemy(r.nextInt(GameMain.WIDTH - 50),r.nextInt(GameMain.HEIGHT - 50),ID.BasicEnemy));
						
					break;
					
				case 4: 
					handler.addObject(new ScanEnemy(r.nextInt(GameMain.WIDTH - 50),r.nextInt(GameMain.HEIGHT - 50),ID.ScanEnemy));
					break;
					
				case 5: 
					handler.addObject(new BasicEnemy(r.nextInt(GameMain.WIDTH - 50),r.nextInt(GameMain.HEIGHT - 50),ID.BasicEnemy));
					break;
					
				case 6: 
					handler.addObject(new ScanEnemy(r.nextInt(GameMain.WIDTH - 50),r.nextInt(GameMain.HEIGHT - 50),ID.ScanEnemy));
					break;
					
				case 7: 
					handler.addObject(new BasicEnemy(r.nextInt(GameMain.WIDTH - 50),r.nextInt(GameMain.HEIGHT - 50),ID.BasicEnemy));
					break;
				
				case 9:
					handler.clearEnemys();
					handler.addObject(new Story(0,0, ID.Story, GameMain.OWNPATH,  handler, hud));
					handler.addObject(new FirstBoss(r.nextInt(GameMain.WIDTH - 50),r.nextInt(GameMain.HEIGHT - 50), ID.FirstBoss, handler));
				}	
		}
	}
}

