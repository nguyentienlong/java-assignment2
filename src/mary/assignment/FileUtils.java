package mary.assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileUtils {
	public static String ReadFile(String path) throws IOException{
		String sCurrentLine;

		BufferedReader br = new BufferedReader(new FileReader(path));
	
		while ((sCurrentLine = br.readLine()) != null) {
			return sCurrentLine; 			
		}
		return "";
	}
	
	public static void WriteFile(String path, String content) throws IOException{
		File file = new File(path);
		 
		// if file doesnt exists, then create it
		if (!file.exists()) {
			file.createNewFile();
		}

		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(content);
		bw.close();
	}
}
