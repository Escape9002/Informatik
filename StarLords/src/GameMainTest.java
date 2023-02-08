import javax.swing.JOptionPane;

import music.MusicPlayer;

public class GameMainTest {
	
	static MusicPlayer mPlayer = new MusicPlayer();

	public static void main(String[] args) {
		mPlayer.play("music/2ndSong.wav");
		
		JOptionPane.showMessageDialog(null,"Press ok to stop");

	}

}
