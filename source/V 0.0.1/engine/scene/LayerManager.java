package engine.scene;

import java.util.*;

public class LayerManager {

	private Map<Integer, Layer> layerMap = new HashMap<>();
	
	public void add(Layer layer,int order){
		layerMap.put(order, layer);
	}
	

	
}
