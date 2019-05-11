package Tyantra;

public class Patt7 {

	public static void main(String[] args) {
		int i, j, n = 5, no=1;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n; j++) {
				if ((i + j) <= (n + 1) && j >= i) {
					System.out.print(no+" ");
				} else {
					System.out.print("  ");
				}
				if(i%2==0) {
				no--;
				}else {
					no++;
				}
			}
			System.out.println();
		}
	}

}
