package nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PrintFileContent {

	public static void main(String[] args) throws IOException {

		String uri = "misc//test_doc.txt";
		
		// may fail if the file is large
		Files.readAllLines(Paths.get(uri)).forEach(System.out::println); 
		
		// for the large files
		Files.lines(Paths.get(uri)).forEach(System.out::println); 

	}

}
