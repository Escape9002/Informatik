package Window;

import java.awt.Canvas;
import java.awt.Color;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.concurrent.TimeUnit;

import javax.swing.JDialog;
import javax.swing.JPanel;

public class Draw extends Canvas implements Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9; // Fenster groese

	private Thread thread; // "Laufzeit" erstellen || Thread eröffnen
	private boolean running = false; // Laeuft das Spiel ? nope
	
	public Draw() {

		new Window(WIDTH, HEIGHT, "Test", this);
		

	}

	public static void draw(int[] array, int speed, Draw obj) {

		BufferStrategy bs = obj.getBufferStrategy();
		if (bs == null) {
			obj.createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();

		g.setColor(Color.white);
		for (int i = 0; i < array.length; i++) {
			// g.fillRect(0, 0, i,array[i]);
			g.drawLine(i, HEIGHT, i, HEIGHT - array[i]);
			
		
			
		}

		try {
			TimeUnit.MICROSECONDS.sleep(speed);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		g.dispose();
		bs.show();

	}
	
	public static void consoleDraw(int[] array, int speed) {

		for (int i = 0; i < array.length; i++) {
			
			for(int y = 0; y < array[i]; y++) {
				System.out.print("0");
			}
			System.out.print("\n");
			
		}


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
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
