package Tyantra;

import java.util.Scanner;

public class Artprog {

	public static void main(String[] args) {
		System.out.println("Enter the a , d , n values");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),d=sc.nextInt(),n=sc.nextInt();
		System.out.print(a+" ");
		for(int i=1;i<=n-1;i++) {
			System.out.print(a+(i*d)+" ");
		}
	}

}
