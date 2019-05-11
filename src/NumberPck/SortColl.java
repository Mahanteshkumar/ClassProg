package NumberPck;

import java.util.TreeSet;

public class SortColl {
	
	public static TreeSet<String> sortAll(String...s) {
		TreeSet<String> t=new TreeSet<String>();
		for(String a:s) {
			t.add(a);
		}
		return t;
	}

	public static void main(String[] args) {
		TreeSet<String> rt = sortAll("sport","google","gmail","hotmail","amazon");
		System.out.println(rt);
	}

}
