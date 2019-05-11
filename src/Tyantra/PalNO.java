package Tyantra;

public class PalNO {

	public static void main(String[] args) {
		int no = 92738;
		int rev = 0;
		while (no != 0) {
			int rem = no % 10;
			rev = (rev * 10) + rem;
			no = no / 10;
		}
		if (no == rev) {
			System.out.println("The given no is palindrome");
		} else {
			System.out.println("The given no is not palindrome");
		}
	}

}
