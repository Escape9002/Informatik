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

	private static final long serialVersionUID = 1L;

	public static final int WIDTH = 1080, HEIGHT = WIDTH / 12 * 9;
	
	private Thread thread;
	private boolean running = false;
	
	private Random r;
	private Handler handler;
	private HUD hud;
	private Spawn spawner;
	
	public final static String OWNPATH = "Story/TextSheet.txt";
	
	public GameMain() {
		MusicPlayer player = new MusicPlayer();
		player.play("music/evolution.wav");
		
		handler = new Handler();
		
		this.addKeyListener(new Controlls(handler));
		
		new Window(WIDTH, HEIGHT, "WhatIsThisPlace", this);
		
		hud = new HUD();
		spawner = new Spawn(handler, hud);
		
		r= new Random();
		
		//handler.addObject(new Story(0,0, ID.Story, OWNPATH , handler, hud));
		
		handler.addObject(new Player(WIDTH/2-32,HEIGHT/2-32, ID.Player, handler));
		
	}
	
	public synchronized void start() {
		thread = new Thread(this);
		thread.start();
		running = true;
	}
	
	public synchronized void stop() {
		try {
			thread.join();
			running = false;
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
    private void tick() {
    	handler.tick();
    	hud.tick();
		spawner.tick();
	}
	
	private void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null) {
			this.createBufferStrategy(3);
			return;
		}
		
		Graphics g = bs.getDrawGraphics();
		
		g.setColor(Color.black);
		g.fillRect(0,0,WIDTH, HEIGHT);
		
		handler.render(g);
		
		hud.render(g);
		
		g.dispose();
		bs.show();
	}
	
	public static float clamp(float var, float min, float max) {
		if(var >= max) {
			return var= max;	
		}else if(var <=min) {
			return var = min;
		}else 
			return var;
	}
	
	public void run() {
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

	        if(System.currentTimeMillis() - timer > 1000) {
	            timer += 1000;
	            System.out.println("FPS: " + frames);
	            System.out.println(hud.getScore());
	            frames = 0;
	        }
	    }
	    stop();
	}

	
	public static void main(String[] args) {
		new GameMain();
	}


}
