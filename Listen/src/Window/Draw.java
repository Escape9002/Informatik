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
	
	static int speed = 0;

	public Draw(int speed) {

		new Window(WIDTH, HEIGHT, "Test", this);
		this.speed = speed;

	}

	public static void drawLine(int[] array,int y, Draw obj) {

		BufferStrategy bs = obj.getBufferStrategy();
		if (bs == null) {
			obj.createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();

		g.setColor(Color.white);
		g.clearRect(0, 0, WIDTH, HEIGHT);

		
		for (int i = 0; i < array.length; i++) {
			int facX = (int) WIDTH / array.length;
			
			if(array[i] == array[y]) {
				g.setColor(Color.red);
			}else {
			g.setColor(Color.black);
			}
		
			g.drawLine(i*facX,HEIGHT,i*facX,HEIGHT - array[i]);
		
		}

		try {
			TimeUnit.MICROSECONDS.sleep(speed);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		g.dispose();

		bs.show();

	}
	
	public static void drawLine(int[] array,Draw obj) {

		BufferStrategy bs = obj.getBufferStrategy();
		if (bs == null) {
			obj.createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();

		g.setColor(Color.white);
		g.clearRect(0, 0, WIDTH, HEIGHT);

		
		for (int i = 0; i < array.length; i++) {
			int facX = (int) WIDTH / array.length;
			
			
			g.setColor(Color.black);
			
		
			g.drawLine(i*facX,HEIGHT,i*facX,HEIGHT - array[i]);
		
		}

		try {
			TimeUnit.MICROSECONDS.sleep(speed);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		g.dispose();

		bs.show();

	}
	
	public static void drawLine(int[] array,int y, int max,Draw obj) {

		BufferStrategy bs = obj.getBufferStrategy();
		if (bs == null) {
			obj.createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();

		g.setColor(Color.white);
		g.clearRect(0, 0, WIDTH, HEIGHT);

		
		for (int i = 0; i < array.length; i++) {
			int facX = (int) WIDTH / array.length;
			int facY = (int) HEIGHT /  max;
			if(array[i] == array[y]) {
				g.setColor(Color.red);
			}else {
			g.setColor(Color.black);
			}
		
			g.drawLine(i*facX,HEIGHT,i*facX,HEIGHT - array[i] * facY);
		
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

			for (int y = 0; y < array[i]; y++) {
				System.out.print("0");
			}
			System.out.print("\n");

		}

	}

	public static void test(Draw obj) {

		BufferStrategy bs = obj.getBufferStrategy();
		if (bs == null) {
			obj.createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();

		g.setColor(Color.white);
		g.clearRect(0, 0, WIDTH, HEIGHT);

		int x = 1;
		g.setColor(Color.black);
		g.fillRect(x, 0, x + 5, 250);

		g.dispose();
		bs.show();
	}

	public synchronized void start() {
		/*
		 * starte den Thread, das Spiel laeuft jetzt
		 */
		thread = new Thread(this);
		thread.start();
		
	}

	public synchronized void stop() {
		/*
		 * thread blockieren bis eclipse ihn beendet, spiel aus
		 */
		try {
			thread.join();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
