package Tyantra;

import java.util.Scanner;

public class GivenNoErO {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		if (no % 2 == 0) {
			System.out.println("Given number is even");
		} else {
			System.out.println("Given number is Odd");
		}
	}

}
