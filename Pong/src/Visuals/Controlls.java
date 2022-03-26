package Visuals;
import Entities.*;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Controlls extends KeyAdapter {

	private Handler handler; //handler da auf Objekte zugegriffen werden muss (object-List)
	private boolean[] keyDown = new boolean[4]; // states
	
	
	public Controlls(Handler handler) {
		this.handler = handler;
		
		keyDown[0] = false;
		keyDown[1] = false;
		keyDown[2] = false;
		keyDown[3] = false;
	}
	
	public void keyPressed(KeyEvent e) {
		/*
		 * Erhalte gedrueckte Taste
		 * iteriere durch Objekt-Liste bis richtige ID gefunden
		 * verändere die Geschwindigkeit und damit die Richtung , setze keyDown auf true
		 * 
		 *  Wenn ESC gedrueckt, schliese Spiel
		 */
		int key = e.getKeyCode();	
		
		for(int i = 0; i< handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i);
			
			if(tempObject.getId() == ID.leftWall){
				//controls for player 1
				
				if(key == KeyEvent.VK_W) { tempObject.setVelY(-5); keyDown[0] = true; }
				if(key == KeyEvent.VK_S) { tempObject.setVelY(5); keyDown[1] = true; }
				
				}
			
			if(tempObject.getId() == ID.rightWall){
				//controls for player 2
				
				if(key == KeyEvent.VK_UP) { tempObject.setVelY(-5); keyDown[0] = true; }
				if(key == KeyEvent.VK_DOWN) { tempObject.setVelY(5); keyDown[1] = true; }
				
				}
			}
		
		if(key == KeyEvent.VK_ESCAPE) System.exit(1);
	}
	
	public void keyReleased(KeyEvent e) {
		/*
		 * erhalte Taste die losgelassen wurde
		 * iteriere durch Objekt-Liste bis richtige ID gefunden
		 * setze keyDown auf false
		 * wenn beide tasten losgelassen stoppe die Bewegung
		 */
		int key = e.getKeyCode();
		
		for(int i = 0; i< handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i);
			
			if(tempObject.getId() == ID.leftWall){
				//Shit for player 1
				
				if(key == KeyEvent.VK_W) keyDown[0] = false; 
				if(key == KeyEvent.VK_S) keyDown[1] = false; 
				
				
				//vertical movement
				if (!keyDown[0] && !keyDown[1]) tempObject.setVelY(0);
			
				}
			
			if(tempObject.getId() == ID.rightWall){
				//Shit for player 2
				
				if(key == KeyEvent.VK_UP) keyDown[0] = false; 
				if(key == KeyEvent.VK_DOWN) keyDown[1] = false; 
				
				//if(key == KeyEvent.VK_D) keyDown[2] = false; 
				//if(key == KeyEvent.VK_A) keyDown[3] = false; 
				
				
				//vertical movement
				if (!keyDown[0] && !keyDown[1]) tempObject.setVelY(0);
				
			}	
			
		}
	}
}
