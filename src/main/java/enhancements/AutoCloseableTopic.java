package enhancements;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

/* The try-with-resources statement ensures that each resource is closed at the end of the statement.
 * Any object that implements java.lang.AutoCloseable, which includes all objects which implement java.io.Closeable,
 * can be used as a resource.
 * 
 * Closeable is an older interface.
 * Closeable.close() throws IOException. 
 * A lot of close() methods that could benefit of try-with-resources throw other checked exceptions 
 * (e.g. java.sql.Connection.close() so AutoCloseable.close() throws Exception. 
 * Changing the existing Closeable contract would break all existing applications/library relying 
 * on the contract that close() only throws IOException and not all (checked) exceptions. * 
 * */

public class AutoCloseableTopic {

	public static void main(String[] args) throws IOException {

		try (RandomAccessFile aFile = new RandomAccessFile("misc\\test_doc.txt", "rw")) {
			
		    FileChannel inChannel = aFile.getChannel();
	
		    ByteBuffer buf = ByteBuffer.allocate(20);
		    int bytesRead = inChannel.read(buf);
	
		    buf.flip();
		    CharBuffer cbuf = StandardCharsets.UTF_8.decode(buf);
		    System.out.println("cbuf: " + cbuf);
		    
		    while (bytesRead != -1) {
	
		      System.out.println("Read " + bytesRead);
	
		      while(cbuf.hasRemaining()){
		          System.out.println((char) cbuf.get());
		      }
	
		      buf.clear();
		      bytesRead = inChannel.read(buf);
		    }
		    // aFile.close(); // this is not needed with try-with-resources
		}

	}

}
