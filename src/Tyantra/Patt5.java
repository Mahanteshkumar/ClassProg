package Tyantra;

public class Patt5 {

	public static void main(String[] args) {
		int n = 3, no = 1;
		int space = n - 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < space; j++)
				System.out.print(" ");
			for (int j = 0; j <= i; j++)
				System.out.print(no + " ");
			if (no == 1) {
				no = 0;
			} else {
				no = 1;
			}
			System.out.println();
			space--;
		}

		space = 0;

		for (int i = n; i > 0; i--) {
			for (int j = 0; j < space; j++)
				System.out.print(" ");
			for (int j = 0; j < i; j++)
				System.out.print(no + " ");
			if (no == 1) {
				no = 0;
			} else {
				no = 1;
			}
			System.out.println();
			space++;
		}

	}

}
