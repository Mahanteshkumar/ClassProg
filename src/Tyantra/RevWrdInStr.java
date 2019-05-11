package Tyantra;

public class RevWrdInStr {

	public static String revers(String s1) {
		String s = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			s = s + s1.charAt(i);
		}
		return s;
	}

	public static void main(String[] args) {
		String str = "java selenium professional";
		String s = "", s1 = " ";
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			s = s + RevWrdInStr.revers(arr[i]) + s1;
		}
		System.out.println(s);
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

}
