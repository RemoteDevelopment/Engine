package engine.util;

import java.util.*;

import engine.gfx.model.*;
import engine.maths.Vector2f;

public class GenericDemo {

	
	
	public static <T extends Model> T getModel(List<Model> models, Class<T> type){
		return type.cast(models.get(0));
	}
	
	public static void main(String[] args) {
		Model stdModel = new Cube(new Vector2f(0,0), new Vector2f(0,0));
		List<Model> models = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			models.add(stdModel);
		}
		Model model = getModel(models, Cube.class);
		System.out.println(model.getClass().getName());
	}
	
}
