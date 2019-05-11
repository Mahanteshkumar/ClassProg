package Tyantra;

public class InstanceofPro {

	public static void main(String[] args) {
		String s=new String("hello");
		System.out.println(s instanceof String);
		Object obj=new Integer(0);
		System.out.println((String)obj);
	}
}