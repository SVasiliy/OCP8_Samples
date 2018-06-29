package nio2;

import java.nio.file.spi.FileSystemProvider;
import java.util.List;

public class SystemProviderDemo {

	public static void main(String[] args) {

        // list of available providers
		// usually there are 2: default and zip/jar file system provider
		List<FileSystemProvider> lst = FileSystemProvider.installedProviders();
		
	}

}
