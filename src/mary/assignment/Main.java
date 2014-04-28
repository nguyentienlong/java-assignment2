package mary.assignment;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// Read file
		String inputPath = "..\\Assginment2\\src\\mary\\assignment\\input.txt";
		String outputPath = "..\\Assginment2\\src\\mary\\assignment\\encrypted.txt";
		try {
			String input = FileUtils.ReadFile(inputPath);
			//encrypt string from file
			EncryptDecrypt encrytedTool = new EncryptDecrypt();
			String decryptedString = encrytedTool.encrypt(input);
			System.out.println(decryptedString);
			//write output to encrypted.txt
			FileUtils.WriteFile(outputPath, decryptedString);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
