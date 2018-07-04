package nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathComponents {

	public static void printPathInformation( Path path) {
		
		System.out.println( "Filename is: " + path.getFileName());
		System.out.println( "Root is: " + path.getRoot());
	
		Path currentParent = path;
		while((currentParent = currentParent.getParent()) != null) {
			System.out.println("Current parent is: " + currentParent);
		}
		
	}
	
	public static void main(String[] args) {
		
		printPathInformation( Paths.get("/zoo/armadillo/shells.txt"));  // filename: shells.txt
																        // root: /
		
		
		printPathInformation( Paths.get("/"));  // filename: null
		                                        // parent: null
		                                        // root: /
		
		// test toAbsolutePath() method
		Path p = Paths.get("temp/test.txt");
		System.out.println(p.toAbsolutePath());  // joins the relative path with the CURRENT WORKING directory 
		
		
	}

}
