package Tyantra;

public class Patt4 {

	public static void main(String[] args) {
		int n=5,no=5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((j+i)==(n-1)||(j==i)) {
					System.out.print(no+" ");
				} else {
					System.out.print("  ");
				}
			}
			no--;
			System.out.println();
		}
	}
}