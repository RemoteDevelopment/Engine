package engine.gfx.model;

import java.awt.*;

import engine.maths.Vector2f;

public class Cube extends Model {

	public Cube(Vector2f position, Vector2f scale) {
		super(position, scale);
		
	}

	@Override
	public void render(Graphics g, Graphics2D g2d) {
		g.setColor(Color.red);
		g.drawRect(32,32,32,32);
	}

}
