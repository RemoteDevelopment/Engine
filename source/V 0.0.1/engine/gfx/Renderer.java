package engine.gfx;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import engine.gfx.model.Model;

public class Renderer {

	private List<Model> models = new ArrayList<>();

	public static int DEBUG = 1;
	
	public Renderer() {
		
	}

	public void render(Graphics g, Graphics2D g2d) {

		if(DEBUG == 1)
			renderDebug(g);
		
		for (Model model : models) {
			model.render(g, g2d);
		}
		
	}
	
	/**Testing graphics in development mode */
	private void renderDebug(Graphics g) {
		
	}

	public void renderModel(Model model) {
		models.add(model);
	}

	public void clear() {
		models.clear();
	}

}
