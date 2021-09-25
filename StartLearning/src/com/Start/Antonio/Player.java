package com.Start.Antonio;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.Random;
import java.util.Scanner;

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
	private String[] BadWordStorage = { "Hello, fuck you", "There is a difference between letters and integers...",
			"48 6f 70 65 49 74 48 75 72 74 73", "BrainCells.exe stoppped working", "42 79 65 48 61 76 65 53 68 69 74 54 69 6d 65",
			"Appears you can read...USE IT", "Shit piss fuck cunt cocksucker motherfucker tit fart turd and twat", "https://www.youtube.com/watch?v=0SqhSfx2TkE", "..."};

	static int ObjectCounter = 0;

	public Player() {
		ObjectCounter = ObjectCounter++;
	}

	private boolean validateInputStr(String nameInput) {
		if (nameInput == null)
			return false;// checks if the String is null

		int len = nameInput.length();

		for (int i = 0; i < len; i++) {
			if ((Character.isLetter(nameInput.charAt(i)) == false)) {

				System.out.println("Analphabetic");
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

		System.out.println("How old are you? (Please enter integers between 0-120)");

		eingabe = sc.next();

		try {
			age = Integer.parseInt(eingabe);

//			age = sc.nextInt(); //why does not work?

		} catch (NumberFormatException e) {
			System.out.println("Analphabetic");
			new Window(WIDTH, HEIGHT, "TextGame", this);
		}

		System.out.println("Enter your lucky number! (Between 1- 100)");

		eingabe = sc.next();

		try {

			luckyNumber = Integer.parseInt(eingabe);

			if (luckyNumber < 0) {
				System.out.println("Analphabetic");
				new Window(WIDTH, HEIGHT, "TextGame", this);
			} else if (luckyNumber > 100) {
				System.out.println("Analphabetic");
				new Window(WIDTH, HEIGHT, "TextGame", this);
			}

			System.out.println("Your Lucky Number: " + luckyNumber);

		} catch (NumberFormatException e) {
			System.out.println("Analphabetic");
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
		g.drawString(BadWordStorage[randNumber], WIDTH / 2-128, HEIGHT / 2);

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
