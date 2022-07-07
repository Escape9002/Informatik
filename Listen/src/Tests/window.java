package Tests;

import java.awt.Color;

import javax.swing.JDialog;
import javax.swing.JPanel;

public class window {
	public static void main(String[]args) {
		// Erzeugung eines neuen Dialoges
        JDialog meinJDialog = new JDialog();
        meinJDialog.setTitle("JPanel Beispiel");
        meinJDialog.setSize(450,300);
 
        JPanel panel = new JPanel();
        // Hier setzen wir die Hintergrundfarbe unseres JPanels auf rot
        panel.setBackground(Color.red);
        // Hier fügen wir unserem Dialog unser JPanel hinzu
        meinJDialog.add(panel);
        // Wir lassen unseren Dialog anzeigen
        meinJDialog.setVisible(true);
	}
}
