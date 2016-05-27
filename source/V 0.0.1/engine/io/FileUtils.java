package engine.io;

import static java.nio.file.StandardOpenOption.*;

import java.io.*;
import java.nio.file.*;

public class FileUtils {

	public static File[] findFiles(String dirName, String extension) {
		File dir = new File(dirName);

		return dir.listFiles(new FilenameFilter() {
			public boolean accept(File dir, String filename) {
				return filename.endsWith("." + extension);
			}
		});

	}
	
	public static Path[] finder(String dir, String extension){
		File[] files = findFiles(dir, extension);
		Path[] result = new Path[files.length];
		for (int i = 0; i < files.length; i++) {
			result[i] = Paths.get(files[i].getPath());
		}
		return result;
	}
	
	public static void write(String file, String text){
		if(!Files.exists(Paths.get(file)))
			try {
				Files.createFile(Paths.get(file));
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		byte data[] = text.getBytes();
	    Path p = Paths.get(file);

	    try (OutputStream out = new BufferedOutputStream(
	      Files.newOutputStream(p, CREATE, APPEND))) {
	      out.write(data, 0, data.length);
	    } catch (IOException x) {
	      System.err.println(x);
	    }
	}
	
	
}
