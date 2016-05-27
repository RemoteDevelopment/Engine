package engine.objects;

import engine.maths.Vector2f;

public abstract class GameObject implements IGameObject {

	protected Vector2f position;
	protected Vector2f scale;
	
	protected int id;
	
	public GameObject(Vector2f position, Vector2f scale, int id) {
		this.position = position;
		this.scale = scale;
		this.id = id;
	}

	public Vector2f getPosition() {
		return position;
	}

	public Vector2f getScale() {
		return scale;
	}

	public int getId() {
		return id;
	}

	public void setPosition(Vector2f position) {
		this.position = position;
	}

	public void setScale(Vector2f scale) {
		this.scale = scale;
	}

	public void setId(int id) {
		this.id = id;
	}

}
