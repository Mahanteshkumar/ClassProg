package NumberPck;

import java.util.ArrayList;

public class ListOfString {
	public static ArrayList<String> liststr(String ...s1) {
		ArrayList<String> a=new ArrayList<String>();
		for(String s:s1) {
			a.add(s);
		}
		return a;
	}
public static void main(String[] args) {
	ArrayList<String> rv = liststr("google","yahoo","amazon","flipkart","even");
	System.out.println(rv);
}
}
