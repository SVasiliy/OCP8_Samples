package nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathCopy {

	public static void main(String[] args) {

		try {
			Files.copy( Paths.get("misc\\test_doc.txt"), 
							Paths.get("misc\\test_doc_copy.txt"), 
								StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
