package GameMain;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.Random;


import Visuals.*;
import Visuals.Handler;
import music.MusicPlayer;
import Entities.*;


public class GameMain extends Canvas implements Runnable{

	private static final long serialVersionUID = 1L; // Serial fuer Fenster-Verwaltung

	public static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9;	// Fenster groese
	
	private Thread thread;	// "Laufzeit" erstellen || Thread eröffnen
	private boolean running = false;	// Laeuft das Spiel ? nope
	
	private Handler handler;	// Objekt Verwalter 
	private HUD hud;	// Heads-Up-Display
	
	public GameMain() {
		MusicPlayer player = new MusicPlayer();	// Musik!
		player.play("music/eisenfunk_pong.wav", true);	// Musik! und loop
		
		handler = new Handler();	// init Verwalter
		
		this.addKeyListener(new Controlls(handler)); // activate KeyListener fuer Tastatur
		
		new Window(WIDTH, HEIGHT, "PONG", this);	// Fenster in fester Groese und mit Namen erzeugen
		
		hud = new HUD();	// Darstellung
		
		// init Player1 + 2 + Ball
		handler.addObject(new leftWall(WIDTH-WIDTH/8,HEIGHT/2-32, ID.leftWall ));	
		handler.addObject(new rightWall(WIDTH/2 - 280,HEIGHT/2-32, ID.rightWall));
		handler.addObject(new Ball(WIDTH/2 - 32, HEIGHT/2 - 32, ID.Ball,handler, hud));
		
	}
	
	public synchronized void start() {
		/*
		 * starte den Thread, das Spiel laeuft jetzt
		 */
		thread = new Thread(this);
		thread.start();
		running = true;
	}
	
	public synchronized void stop() {
		/*
		 * thread blockieren bis eclipse ihn beendet, spiel aus
		 */
		try {
			thread.join();
			running = false;
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
    private void tick() {
    	/*
    	 * führe Berechnungen aus für Objekte und HUD
    	 */
    		handler.tick();
    		hud.tick();
	}
	
	private void render() {
		/*
		 * Darstelleung
		 * bufferstrategie fuer effektive darstellung
		 * starte alle .render der Objekte und von HUD
		 * 
		 * Hintergrund: BLACK
		 * DESIGN: Mittelstrich
		 */
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null) {
			this.createBufferStrategy(3);
			return;
		}
		
		Graphics g = bs.getDrawGraphics();
		
		g.setColor(Color.black);
		g.fillRect(0,0,WIDTH, HEIGHT);
		
		g.setColor(Color.white);
		g.drawLine(WIDTH/2, HEIGHT-50, WIDTH/2, 10);
		
		handler.render(g);
		
		hud.render(g);
		
		g.dispose();
		bs.show();
	}
	
	public static float clamp(float var, float min, float max) {
		/*
		 * Werte Begrenzer
		 * setzt zu große Werte auf mitgegebenen max Wert
		 * setzt zu kleine Werte auf mitgegebenen min Wert
		 */
		if(var >= max) {
			return var= max;	
		}else if(var <=min) {
			return var = min;
		}else 
			return var;
	}
	
	public void run() {
		/*
		 * Game-Loop
		 * FPS: unbegrenzt
		 * führe in gleichmaesigen Abstaenden die Methoden tick und render aus
		 * unendlicher loop bis running seinen status aendert
		 */
		//TODO ueber running einen exit knopf einfuegen
		this.requestFocus();
	    long lastTime = System.nanoTime();
	    double amountOfTicks = 60.0;
	    double ns = 1000000000 / amountOfTicks;
	    double delta = 0;
	    long timer = System.currentTimeMillis();
	    int frames = 0 ;
	    while (running) {
	        long now = System.nanoTime();
	        delta += (now - lastTime) / ns;
	        lastTime = now;
	        while (delta >= 1) {
	            tick();
	            delta--;
	        }
	        if(running)
	            render();
	        frames++;
	        
	        /* // Debug 
	        if(System.currentTimeMillis() - timer > 1000) {
	            timer += 1000;
	            System.out.println("FPS: " + frames);
	            //System.out.println(hud.getScore1());
	            frames = 0;
	        }
	        */
	    }
	    stop();
	}

	
	public static void main(String[] args) {
		// Main funktion, starte diese Klasse und seinen Constructor
		new GameMain();
	}


}
