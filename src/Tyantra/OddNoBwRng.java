package Tyantra;

import java.util.Scanner;

class OddNoBwRng {

	public static void main(String[] args) {
		System.out.println("Enter the range");
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt(), u = sc.nextInt();
		while (u != l) {
			if (l % 2 != 0) {
				System.out.print(l + " ");
			}
			l++;
		}

	}

}
