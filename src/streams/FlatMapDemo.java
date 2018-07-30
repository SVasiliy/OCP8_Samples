package streams;

import java.util.Arrays;
import java.util.List;

class Bookk {
	String name;
	double price;
	
	public Bookk (String n, double p) {
		this.name = n;
		this.price = p;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}

public class FlatMapDemo {
	
	public static void main (String args[]) {

	List<List<Bookk>> books = Arrays.asList(         
			Arrays.asList( new Bookk ("Windmills of the Gods", 7.0),
					       new Bookk("Tell me your dreams",9.0) ),
			Arrays.asList( new Bookk("There is a hippy on the highway", 5.0),
					       new Bookk("Easy come easy go", 5.0)) 
	);  
	
	double d = books.stream().flatMap(x -> x.stream()).mapToDouble(s -> s.getPrice())         
		.sum(); 

	System.out.println(d);
	
	}
	
}
