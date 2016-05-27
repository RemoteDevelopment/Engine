package engine.util;

import java.awt.Rectangle;
import java.util.*;

import engine.maths.Vector2f;

public class Util {

	private static Random r = new Random();
	
	public static String generateRandomNumber(int length){
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < length; i++) 
			sb.append(String.valueOf(r.nextInt(10)));
		
		return sb.toString();
	}
	
	public static Rectangle vectorToRectangle(Vector2f pos, Vector2f scale) {
		return new Rectangle((int) pos.x, (int) pos.y, (int) scale.x, (int) scale.y);
	}

	public static String intArrayToString(int[] data) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < data.length; i++)
			result.append((char) data[i]);
		return result.toString();
	}

	public static int[] stringToIntArray(String s) {
		int[] result = new int[s.length()];
		for (int i = 0; i < s.length(); i++)
			result[i] = (int) s.charAt(i);
		return result;
	}
	
	public static <T> void addListtoList(List<T> list, List<T> target){
		for (int i = 0; i < list.size(); i++) {
			target.add(list.get(i));
		}
		
	}
	
	
	
	
}
