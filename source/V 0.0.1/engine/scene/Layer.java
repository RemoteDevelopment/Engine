package engine.scene;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import engine.gfx.Renderer;
import engine.objects.GameObject;

public class Layer {
	
	private List<GameObject> objects = new CopyOnWriteArrayList<>();
	
	public void render(Renderer renderer){
		for(GameObject obj : objects)
			obj.render(renderer);
	}
	
	public void addObejct(GameObject obj){
		objects.add(obj);
	}
	
	
}
