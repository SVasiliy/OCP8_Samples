package enhancements;

import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.IOException; 


public class BufferedReaderDemo {

	public static void main(String[] args) {

		try( BufferedReader bfr = new BufferedReader
				( new FileReader("misc\\test_doc.txt"))) {
					String line = null;
					while ((line = bfr.readLine()) != null) {
						System.out.println(line);
					}         
		} catch ( IOException e) {
			  e.printStackTrace();
		}     
	} 
	
}

