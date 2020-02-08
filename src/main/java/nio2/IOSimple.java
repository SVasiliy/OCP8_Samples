package nio2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOSimple {
	
	public static void main( String args[]) throws IOException {

		
		// basic byte read
        System.out.println("basic byte read");
        
		InputStream is = new FileInputStream("misc/test_doc.txt");
		int i = is.read();               // notice "int", not "byte". This is to be able to receive -1                 
		while (i != -1) {
			System.out.println(i);
			i = is.read();
		};
		
		
		
		// basic byte read in the array
        System.out.println("basic byte read in the array");

        InputStream is2 = new FileInputStream("misc/test_doc.txt");
		byte[] array = new byte[10];
		int k = is2.read(array);
		
		for (int s = 0; s < 10; s++) {
			  System.out.println((char) array[s]);
			}
		System.out.println("total read: " + k);
		
		
		
		// buffered input stream
        System.out.println("buffered input stream");
        
		InputStream is3 = new FileInputStream("misc/test_doc.txt");
		BufferedInputStream bis = new BufferedInputStream(is3, 64);    // tuning the stream size
		byte[] ch = new byte[32];
		int k2 = bis.read(ch);
		
		for (int s = 0; s < 10; s++) {
		  System.out.println((char)ch[s]);
		}
		System.out.println("total read: " + k2);
				
		
		
		// wrap as InputStreamReader (+ use encoding to be able to convert non-ASCII symbols)
        System.out.println("InputStreamReader");
		
        InputStreamReader is4 = new InputStreamReader (new FileInputStream("misc/test_doc.txt"), "UTF-8");
		
		char[] ch2 = new char[64];
		int k3 = is4.read(ch2);
		
		for (int s = 0; s <= k3; s++)
			System.out.println( ch2[s]);
	
		System.out.println("total read: " + k3);
	
	}

}
