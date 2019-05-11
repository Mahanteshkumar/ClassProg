package Tyantra;

public class AsceOrder {

	public static void main(String[] args) {
		int no1 = 344;
		int no2 = 646;
		int no3 = 97;
		if ((no1 > no2 && no1 > no3)) {
			if (no2 > no3) {
				System.out.print(no3 + " " + no2 + " " + no1);
			} else
				System.out.print(no2 + " " + no3 + " " + no1);
		} else if ((no2 > no1 && no2 > no3)) {
			if (no1 > no3) {
				System.out.print(no3 + " " + no1 + " " + no2);
			} else {
				System.out.print(no1 + " " + no3 + " " + no2);
			}
		} else if ((no3 > no1 && no3 > no2)) {
			if (no1 > no2) {
				System.out.print(no2 + " " + no1 + " " + no3);
			} else
				System.out.print(no1 + " " + no2 + " " + no3);
		} else {
			System.out.println("ERROR!");
		}

	}

}
