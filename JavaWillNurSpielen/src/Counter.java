import javax.swing.*;

import util.ShowInFrame;

import java.awt.event.*;

public class Counter extends SimpleButton {
static int i = 0;
	public Counter() {
		b1.addActionListener(

				new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						i++;
						l.setText("" + i);
						
					}
				}

		);
		
		b2.addActionListener(

				new ActionListener() {
					

					public void actionPerformed(ActionEvent e) {
						i--;
						l.setText("" + i);
						
					}
				}

		);
		
		b3.addActionListener(

				new ActionListener() {
					

					public void actionPerformed(ActionEvent e) {
						i=0;
						l.setText("" + i);
						
					}
				}

		);
		
	}
	

	public static void main(String[] args) {
		ShowInFrame.show(new Counter());

	}

}
