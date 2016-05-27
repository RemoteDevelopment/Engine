package engine.gfx.model;

import java.awt.*;
import java.awt.geom.Line2D;

import engine.maths.Vector2f;

public class Line extends Model{

	public Line(Vector2f position, Vector2f scale) {
		super(position, scale);
	}

	public void render(Graphics g, Graphics2D g2d) {
		Line2D line = new Line2D.Float(position.x, position.y, position.x + scale.x, position.y + scale.y);
		g2d.setColor(Color.yellow);
		g2d.draw(line);
	}

}
