package nio2;

import java.io.IOException;
import java.nio.file.*;

public class WatchServiceDemo {

	public static void main(String[] args) throws IOException, InterruptedException {

		WatchService watchService = FileSystems.getDefault().newWatchService();
		Path path = Paths.get("misc/nested");
		
		path.register( watchService, StandardWatchEventKinds.ENTRY_CREATE, 
										StandardWatchEventKinds.ENTRY_MODIFY, 
											StandardWatchEventKinds.ENTRY_DELETE );
		
		WatchKey wk = null;
		while ((wk = watchService.take()) != null) {
			
			for (WatchEvent<?> event : wk.pollEvents()) {
				System.out.println( "Event kind: " + event.kind()
						+ ". File affected: " + event.context() + ".");
			}
			
			// when the WatchKey instance is returned by either of the poll or take APIs, 
			// it will not capture more events if it's reset API is not invoked
			wk.reset();
			
		}
		
	}

}
