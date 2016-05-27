package engine.maths;

public class Vector2f {

	public float x, y;

	public Vector2f(float x, float y) {
		set(x, y);
	}

	public Vector2f() {
		set(0.0f, 0.0f);
	}

	public void set(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public float length() {
		return (float) Math.sqrt(x * x + y * y);
	}
	
	
	public void add(Vector2f v) {
		this.x += v.x;
		this.y += v.y;
	}
	
	public void add(float v) {
		this.x += v;
		this.y += v;
	}

	public void sub(Vector2f v) {
		this.x -= v.x;
		this.y -= v.y;
	}

	public void sub(float v) {
		this.x -= x;
		this.y -= y;
	}

	public void mul(Vector2f v) {
		this.x *= v.x;
		this.y *= v.y;
	}
	
	public void mul(float v) {
		this.x *= x;
		this.y *= y;
	}

	public void div(Vector2f v) {
		this.x /= v.x;
		this.y /= v.y;
	}

	public void div(float v) {
		this.x /= x;
		this.y /= y;
	}
}
