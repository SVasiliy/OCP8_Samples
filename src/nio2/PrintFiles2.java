package nio2;

import static java.nio.file.FileVisitResult.*;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class PrintFiles2
    extends SimpleFileVisitor<Path> {
	
	PathMatcher pm = FileSystems.getDefault().getPathMatcher("glob:*.txt");

    @Override
    public FileVisitResult visitFile(Path file,
                                   BasicFileAttributes attr) {
    	
    	if ( file != null && pm.matches(file.getFileName()))
    		System.out.println("(file: " + file.getFileName() + " " + attr.size() + " bytes)");
        return CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir,
                                          IOException exc) {
    //    System.out.format("Directory: %s%n", dir);
        return CONTINUE;
    }

}


