package Tyantra;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateInArray {

	public static void main(String[] args) {
		String arr[]= {"google", "yahoo","google", "insvic", "abd"};
		Set<String> ss=new TreeSet<String>();
		for(String s:arr) {
			ss.add(s);
		}
		System.out.println(ss);
	}

}
