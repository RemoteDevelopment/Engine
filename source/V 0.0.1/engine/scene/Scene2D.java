package engine.scene;

import java.util.List;

import engine.objects.GameObject;
import engine.util.Util;

public class Scene2D {

//	private LayerManager layerManager;
//	private Renderer renderer;//?
	
	private List<GameObject> objects;
	
	public Scene2D(){
	}
	
	public void addObject(List<GameObject> objects){
		Util.addListtoList(objects, this.objects);
	}
	
}
