package music;
//	Music from <a href="https://pixabay.com/music/?utm_source=link-attribution&amp;utm_medium=referral&amp;utm_campaign=music&amp;utm_content=14845">Pixabay</a>


import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;


public class MusicPlayer {
	
	public MusicPlayer() {
	}
	
	public void play(String filepath, boolean loop) {
		/*
		 * Versuche Datei zu finden und zu laden,
		 * in Clip umwandeln, je nach mitgabewert den Song unendlich loopen oder nicht
		 * Spielen!
		 * 
		 * ! Datei muss .wav sein !
		 */
		try {
		File musicPath = new File(filepath);
		if(musicPath.exists()) {
			AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
			Clip clip = AudioSystem.getClip();
			clip.open(audioInput);
			if(loop) {
				clip.loop(clip.LOOP_CONTINUOUSLY);
			}
			
			clip.start();
		}else {
			JOptionPane.showMessageDialog(null, "couldnt find the music file");
		}
			
			
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ERROR");
		}
	}
	
	public void play(String filepath) {
		try {
		File musicPath = new File(filepath);
		if(musicPath.exists()) {
			AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
			Clip clip = AudioSystem.getClip();
			clip.open(audioInput);
			
			clip.start();
		}else {
			JOptionPane.showMessageDialog(null, "couldnt find the music file");
		}
			
			
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ERROR");
		}
	}
}
