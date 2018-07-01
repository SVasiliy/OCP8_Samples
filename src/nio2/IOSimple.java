package nio2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOSimple {
	
	public static void main( String args[]) throws IOException {

		// basic byte read
		InputStream is = new FileInputStream("misc\\test_doc.txt");
		int i = is.read();
		while (i != -1) {
			System.out.println(i);
			i = is.read();
		};

	
		// wrap as InputStreamReader
		InputStreamReader is2 = new InputStreamReader (new FileInputStream("misc\\test_doc.txt"));
		
		char[] ch = new char[10];
		is2.read(ch);
		
		System.out.println(ch);
		
	
	
	}

}
