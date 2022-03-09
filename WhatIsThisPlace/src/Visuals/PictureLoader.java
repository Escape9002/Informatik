package Visuals;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PictureLoader {
	
	String imgPath = null;
	BufferedImage myPicture = null;
	
	public PictureLoader(String imgPath) {
		this.imgPath = imgPath;
		try {
			myPicture = ImageIO.read(new File(imgPath));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public BufferedImage getIMG() {
		return myPicture;
	}
}
