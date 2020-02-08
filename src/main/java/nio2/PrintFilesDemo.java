package nio2;

import java.io.IOException;
import java.nio.file.*;

public class PrintFilesDemo {

	public static void main(String[] args) throws IOException {

		PrintFiles pf = new PrintFiles();
		Path path = Paths.get("misc");

		Files.walkFileTree(path, pf);
		
	}

}
