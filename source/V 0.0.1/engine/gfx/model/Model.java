package engine.gfx.model;

import java.awt.*;

import engine.maths.Vector2f;

public abstract class Model {
	
	protected Vector2f position, scale;
	
	public Model(Vector2f position, Vector2f scale){
		this.position = position;
		this.scale = scale;
	}
	
	/**Render the <code>Model</code> */
	public abstract void render(Graphics g, Graphics2D g2d);
	
	
	public void scale(float v){
		this.scale.mul(v);
	}
	
	public void shrink(float v){
		this.scale.div(v);
	}
	
}
