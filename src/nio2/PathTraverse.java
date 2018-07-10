package nio2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTraverse {

	public static void main(String[] args) throws Exception{
	  
		Path path = Paths.get("src");
		
		Files.walk(path).filter(p -> p.toString().endsWith(".java"))
			.forEach(System.out::println);
		
	}

}
