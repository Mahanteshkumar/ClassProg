package Tyantra;

import java.util.Scanner;

public class SwapwioutTv {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int no1=sc.nextInt(),no2=sc.nextInt();
		no1=no1+no2;
		no2=no1-no2;
		no1=no1-no2;
		System.out.print(no1+"\n"+no2);
	}

}
