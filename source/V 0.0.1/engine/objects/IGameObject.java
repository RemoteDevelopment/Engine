package engine.objects;

import engine.gfx.Renderer;
import engine.maths.Vector2f;

public interface IGameObject {

	
	public Vector2f getPosition();
	public Vector2f getScale();
	public int getId();
	
	public void render(Renderer renderer);
	public void update(float dt);
	
	
}
