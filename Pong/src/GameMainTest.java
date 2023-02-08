import javax.swing.JOptionPane;

import music.MusicPlayer;

/*
 * Pure Test-Klasse, momentan wird der Musik-Player getestet
 * ! die Datei existiert nicht mehr !
 */
public class GameMainTest {
	
	static MusicPlayer mPlayer = new MusicPlayer();

	public static void main(String[] args) {
		mPlayer.play("music/2ndSong.wav");
		
		JOptionPane.showMessageDialog(null,"Press ok to stop");

	}

}
