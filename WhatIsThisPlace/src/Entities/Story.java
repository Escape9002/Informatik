package Entities;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import Visuals.HUD;
import Visuals.Handler;

public class Story extends GameObject{
	
	Handler handler;
	HUD hud;
	

	
	public Story(float x, float y, ID id, Handler handler, HUD hud) {
		super(x,y,id);
		
		this.hud = hud;
		this.handler = handler;
	}

	@Override
	public void tick() {

		
	}

	@Override
	public void render(Graphics g) {
		g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		if(status(1,250)) {
			hud.speaking = true;
			
			g.setColor(Color.red);
			g.drawString("", 150,50);
			g.drawString("", 200, 100);
			g.drawString("", 150, 150);
			
		}else if(status(300,350)) {
		
			g.setColor(Color.red);
			g.drawString("", 250,50);
			
		}else if(status(350,450)) {
			
			g.setColor(Color.red);
			g.drawString("These damn minions", 250, 50);
			
		}else if(status(4000,5000)) {
			hud.speaking = true;
			g.setColor(Color.red);
			g.drawString("Your prooved yourself to be worthy of the final fight", 150, 50);
			g.drawString("Now Crumble!", 250, 100);
		}
		
		else {
			hud.speaking = false;
		}
		
	}

	@Override
	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private boolean status(int low, int high) {
		if(hud.getScore()>=low && hud.getScore() <=high) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void fileReadInit() {
		Path path = Paths.get("Story/TextSheet.txt");
		List<String> story = new ArrayList<>();
		
		try (Stream<String> stream = Files.lines(path, StandardCharsets.UTF_8)) {
			story = stream.toList();
			String[] BethLines = story.get(1).split(";");
			String[] YaroLines = story.get(4).split(";");
			String[] SistersLines = story.get(6).split(";");
			
			//System.out.println(story.size());
			//System.out.println(BethLines[0]);
			//System.out.println(YaroLines[0]);
			//System.out.println(SistersLines[0]);
	
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

}
