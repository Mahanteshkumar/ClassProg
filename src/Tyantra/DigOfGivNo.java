package Tyantra;

public class DigOfGivNo {

	public static void main(String[] args) {
		int no = 9266738;
		int count = 0;
		while (no != 0) {
			count++;
			no = no / 10;
		}
		System.out.println("No of digits present in a no is = "+count);
	}

}
