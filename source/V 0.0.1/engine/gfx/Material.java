package engine.gfx;

import java.awt.*;
import java.awt.image.BufferedImage;

import engine.io.ImageLoader;

public class Material {

	private BufferedImage image;
	private Color color = new Color(0,0,0,0);

	public Material(int width, int height, Color color) {
		this.image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

		Graphics2D graphics = image.createGraphics();

		graphics.setPaint(color);
		graphics.fillRect(0, 0, image.getWidth(), image.getHeight());
		graphics.dispose();
	}

	public Material() {
		this.image = ImageLoader.loadImage("./res/textures/image01.jpg");
	}
	
	public BufferedImage tint(int red,int green, int blue, int alpha){
		color = new Color(red, green, blue, alpha / 150);
		Graphics g = image.getGraphics();
	    g.setColor(color);
	    g.fillRect(0, 0, image.getWidth(), image.getHeight());
	    g.dispose();
	    return image;
	}

	public BufferedImage getImage() {
		return image;
	}
	
	public Color getColor() {
		return color;
	}

}
