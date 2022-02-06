import javax.swing.JOptionPane;

import music.MusicPlayer;

public class GameMainTest {
	
	static MusicPlayer mPlayer = new MusicPlayer();

	public static void main(String[] args) {
		mPlayer.play("Tom-Player-AXIS.wav");
		
		JOptionPane.showMessageDialog(null,"Press ok to stop");

	}

}
