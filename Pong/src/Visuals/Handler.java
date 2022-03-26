package Visuals;
import Entities.*;

import java.awt.Graphics;
import java.util.LinkedList;

public class Handler {
	
	public LinkedList<GameObject> object = new LinkedList<GameObject>(); // speicher alle Objekte
	
	public void tick() {
		/*
		 * itteriere durch alle Objekte und fuehre .tick aus 
		 */
		for(int i = 0; i < object.size(); i ++) {
			GameObject tempObject = object.get(i);
			
			tempObject.tick();
		}
	}
	
	public void render(Graphics g) {
		/*
		 * itteriere durch alle Objekte und fuehre .render aus
		 */
		for(int i = 0; i < object.size(); i ++) {
			GameObject tempObject = object.get(i);
			
			tempObject.render(g);
		}
	}
	
	public void clearEnemys() {
		/*
		 * loesche alle Objekte und erzeuge danach  beide Spieler neu
		 */
		
		//TODO Spieler 1 wird nicht sichtbar neu erzeugt und das Spiel wird sehr langsam
		for(int i = 0; i < object.size(); i ++) {
			GameObject tempObject = object.get(i);
			
			if(tempObject.getId() == ID.leftWall ) {
				object.clear();
				addObject(new leftWall((int)tempObject.getX(), (int)tempObject.getY(), ID.leftWall ));
				
			}
			
			if(tempObject.getId() == ID.rightWall ) {
				object.clear();
				addObject(new rightWall((int)tempObject.getX(), (int)tempObject.getY(), ID.rightWall ));
				
			}
			
		}
	}
	
	public void clearAllEnemys() {
		/*
		 * loesche alle Objekte
		 */
		for(int i = 0; i < object.size(); i ++) {

			object.clear();	
		}
	}
	
	public void addObject(GameObject object) {
		/*
		 * objekt zur Liste hinzufuegen
		 */
		this.object.add(object);
	}
	
	public void removeObject(GameObject object) {
		/*
		 * Objekt aus der Liste loeschen
		 */
		this.object.remove(object);
	}
	
}
