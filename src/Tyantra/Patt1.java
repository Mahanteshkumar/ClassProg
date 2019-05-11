package Tyantra;

public class Patt1 {

	public static void main(String[] args) {
		int c = 3;
		int s = 1;
		for (int i = 0; i < 4; i++) {
			for (int j = c; j >= 1; j--) {
				System.out.print("  ");
			}
			for (int k = 1; k <= s; k++) {
				System.out.print("* ");
			}
			System.out.println();
			s += 2;
			c--;
		}
	}

}
