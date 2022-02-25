package music;



import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;


public class MusicPlayer {
	
	public MusicPlayer() {
	}
	
	public void play(String filepath) {
		try {
		File musicPath = new File(filepath);
		if(musicPath.exists()) {
			AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
			Clip clip = AudioSystem.getClip();
			clip.open(audioInput);
			//clip.start();
		}else {
			JOptionPane.showMessageDialog(null, "couldnt find the file");
		}
			
			
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ERROR");
		}
	}
}
