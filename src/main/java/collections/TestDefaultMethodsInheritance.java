package collections;

interface House {
	public default String getAddress(){
		return "101 Main Str";
	} 
}  

interface Bungalow extends House {
	public default String getAddress(){
		return "101 Smart Str";
	} 
}  

class MyHouse implements Bungalow, House {}  




public class TestDefaultMethodsInheritance {

	public static void main(String[] args) {
		House ci = new MyHouse(); //1 ����
		System.out.println(ci.getAddress()); // 101 Smart Str !!! ��
	} 
}
