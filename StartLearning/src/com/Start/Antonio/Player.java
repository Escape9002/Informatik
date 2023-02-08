package com.Start.Antonio;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Player extends Canvas implements Runnable {

	private static final long serialVersionUID = 1L;
	public static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9;
	private Thread thread;
	private boolean running = false;

	Scanner sc = new Scanner(System.in);
	Random r = new Random();

	String firstName = "";
	String sirName = "";
	int age = 0;
	int luckyNumber = 0;

	int randNumber = 0;

	private String[] BadWordStorage = { "48656c6c6f2c206675636b20796f75", "5468657265206973206120646966666572656e6365206265747765656e206c65747465727320616e6420696e7465676572732e2e2e",
			"427261696e43656c6c732e6578652073746f707070656420776f726b696e67",
			"4170706561727320796f752063616e20726561642e2e2e444f204954",
			"536869742070697373206675636b2063756e7420636f636b7375636b6572206d6f746865726675636b6572207469742066617274207475726420616e642074776174",
			"68747470733a2f2f7777772e796f75747562652e636f6d2f77617463683f763d3053716853667832546b45", "2e2e2e" };


	static int ObjectCounter = 0;

	public Player() {
		ObjectCounter = ObjectCounter++;
	}

	public String HEXtoString(String hexStr) {

		StringBuilder output = new StringBuilder("");

		for (int i = 0; i < hexStr.length(); i += 2) {
			String str = hexStr.substring(i, i + 2);
			output.append((char) Integer.parseInt(str, 16));
		}

		return output.toString();

	}

	private boolean validateInputStr(String nameInput) {
		if (nameInput == null)
			return false;// checks if the String is null

		int len = nameInput.length();

		for (int i = 0; i < len; i++) {
			if ((Character.isLetter(nameInput.charAt(i)) == false)) {
				randNumber = r.nextInt(BadWordStorage.length);
				System.out.println(HEXtoString(BadWordStorage[randNumber]));
				new Window(WIDTH, HEIGHT, "TextGame", this);
				return false;
			}
		}

		return true;

	}

	public void catchData() {
		randNumber = r.nextInt(BadWordStorage.length);
		String eingabe = "";

		System.out.println("What's your First Name? (Please enter letters)");
		firstName = sc.next();

		validateInputStr(firstName);
		
		randNumber = r.nextInt(BadWordStorage.length);
		System.out.println("How old are you? (Please enter integers between 0-120)");

		eingabe = sc.next();

		try {
			age = Integer.parseInt(eingabe);

//			age = sc.nextInt(); //why does not work?

		} catch (NumberFormatException e) {
			randNumber = r.nextInt(BadWordStorage.length);
			System.out.println(HEXtoString(BadWordStorage[randNumber]));
			new Window(WIDTH, HEIGHT, "TextGame", this);
		}

		randNumber = r.nextInt(BadWordStorage.length);
		System.out.println("Enter your lucky number! (Between 1- 100)");

		eingabe = sc.next();

		try {

			luckyNumber = Integer.parseInt(eingabe);

			if (luckyNumber < 0) {
				randNumber = r.nextInt(BadWordStorage.length);
				System.out.println(HEXtoString(BadWordStorage[randNumber]));
				new Window(WIDTH, HEIGHT, "TextGame", this);
			} else if (luckyNumber > 100) {
				randNumber = r.nextInt(BadWordStorage.length);
				System.out.println(HEXtoString(BadWordStorage[randNumber]));
				new Window(WIDTH, HEIGHT, "TextGame", this);
			}

			System.out.println("Your Lucky Number: " + luckyNumber);

		} catch (NumberFormatException e) {
			randNumber = r.nextInt(BadWordStorage.length);
			System.out.println(HEXtoString(BadWordStorage[randNumber]));
			new Window(WIDTH, HEIGHT, "TextGame", this);
		}

	}

	public String outputData() {

		return "-----------|| Player: " + ObjectCounter + " | " + "First Name: " + firstName + " | " + "Last Name: "
				+ sirName + " | " + "Age: " + age + " ||-----------";

	}

	public int getAge() {
		return age;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getSirName() {
		return sirName;
	}

	public int getLuckyNumber() {
		return luckyNumber;
	}

	public int GetObjectCounter() {
		return ObjectCounter;
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
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if (bs == null) {
			this.createBufferStrategy(3);
			return;
		}

		Graphics g = bs.getDrawGraphics();

		g.setColor(Color.black);
		g.fillRect(0, 0, WIDTH, HEIGHT);

		g.setColor(Color.white);

		g.drawString(HEXtoString(BadWordStorage[randNumber]), WIDTH / 2 - 128, HEIGHT / 2);

		g.dispose();
		bs.show();
	}

	public void run() {
		this.requestFocus();
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
//	    int frames = 0 ;
		while (running) {
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			if (running)
				render();
//	        frames++;

			if (System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
//	            System.out.println("FPS: " + frames);
//	            frames = 0;
			}
		}
		stop();
	}
}
