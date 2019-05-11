package Tyantra;

import java.util.Scanner;

public class CountChar {
//	public static void count(String s) {
//		s=s.replaceAll("\\s", "");
//		s=s.toLowerCase();
//		String s1=" ";
//		int cnt=0;
//		for (int i = 0; i < s.length(); i++) {
//			for(int j=0;j<s.length();j++)
//				if(s.charAt(i)==s.charAt(j)) {
//					cnt++;
//				}
//			if(cnt==1) {
//				s1=s.charAt(i)+s1;
//			}
//		}
//		System.out.println(s1);
//	}
	public static void main(String[] args) {
		System.out.println("Enter the string : ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s = s.replaceAll("\\s", "");
		s = s.toLowerCase();
		String s1 = " ";
		int cnt = 0;
		for (int i = 0; i < s.length(); i++) {
			cnt=0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					cnt++;
				}
				if (cnt ==1) {
					//System.out.println(s.charAt(i));
					s1 =  s.charAt(i)+s1 ;
				}
			}
		}
		System.out.println(s1);
	}
}