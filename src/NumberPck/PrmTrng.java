package NumberPck;

public class PrmTrng {

	public static void main(String[] args) {
		for (int n = 1; n <= 1000; n++) {
			boolean flag = true;
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					flag = false;
				}
			}
			if (flag == true) {
				System.out.print(n + " ");
			}
		}
	}

}
