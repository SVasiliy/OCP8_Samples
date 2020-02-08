package nio2;

import java.io.IOException;
import java.nio.file.*;

public class PrintFilesDemo2 {

	public static void main(String[] args) throws IOException {


		PrintFiles2 pf = new PrintFiles2();
		Files.walkFileTree( Paths.get("misc"), pf);
		
	}

}
