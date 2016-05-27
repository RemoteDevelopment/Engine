package engine.io;

import java.io.IOException;
import java.nio.file.*;

import static engine.logging.Logger.*;
	

public class ResourceManager {


	public static final String BASE_DATA_FOLDER = "./data/";
	public static final String LOG_FOLDER = BASE_DATA_FOLDER + "logs/";
	
	
	public static final String BASE_RESOURCE_FOLDER = "./res/";
	public static final String TEXTURE_FOLDER = BASE_RESOURCE_FOLDER + "textures/";
	public static final String SOUND_FOLDER = BASE_RESOURCE_FOLDER + "sound/";
	
	
	public static void setup(){
		try {
			//resource files
			if(!Files.exists(Paths.get(BASE_RESOURCE_FOLDER))){
				log("Creating base resource folder", INFO);
				Files.createDirectories(Paths.get(BASE_RESOURCE_FOLDER));
			}
			if(!Files.exists(Paths.get(BASE_RESOURCE_FOLDER + "textures/"))){
				log("Creating textures folder", INFO);
				Files.createDirectories(Paths.get(BASE_RESOURCE_FOLDER + "textures/"));
			}
			if(!Files.exists(Paths.get(BASE_RESOURCE_FOLDER + "sound/"))){
				log("Creating sound folder", INFO);
				Files.createDirectories(Paths.get(BASE_RESOURCE_FOLDER + "sound/"));
			}
			
			//Data files
			if(!Files.exists(Paths.get(BASE_DATA_FOLDER))){
				log("Creating base data folder", INFO);
				Files.createDirectories(Paths.get(BASE_DATA_FOLDER));
			}
			if(!Files.exists(Paths.get(BASE_DATA_FOLDER + "logs/"))){
				log("Creating log folder", INFO);
				Files.createDirectories(Paths.get(BASE_DATA_FOLDER + "logs/"));
			}
			
		} catch (IOException e) {
			log(e.toString(), WARNING);
		}
	}
	
	
	
}
