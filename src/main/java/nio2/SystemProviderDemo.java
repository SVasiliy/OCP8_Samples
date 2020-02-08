package nio2;

import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.spi.FileSystemProvider;
import java.util.Iterator;
import java.util.List;

public class SystemProviderDemo {

	public static void main(String[] args) {

        // list of available providers
		// usually there are 2: default and zip/jar file system provider
		List<FileSystemProvider> lst = FileSystemProvider.installedProviders();

		// default file system
		FileSystem defaultFS = FileSystems.getDefault();
		
		// root directories
		Iterable<Path> roots = defaultFS.getRootDirectories();
		for (Path s : roots)
			System.out.println("root: " + s);  // root: C:\
		
		// file stores
		Iterable<FileStore> stores = defaultFS.getFileStores();
		Iterator iStores = stores.iterator();
		FileStore fStore = (FileStore) iStores.next();
		System.out.println( fStore.toString() + " " + fStore.name() + " " + fStore.type()); // OS (C:) OS NTFS
	}

}
