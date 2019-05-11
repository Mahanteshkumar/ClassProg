package NumberPck;

import java.util.ArrayList;

public class IntArrs {
	public static int[][] valuesint(int... a) {
		int s=a.length;
		int rno=s%3==0?s/3:(s/3)+1;
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int v : a) {
			al.add(v);
		}
		int arr[][] = new int[rno][3];
		int k = 0;
		for (int i = 0; i < rno; i++) {
			for (int j = 0; j < 3; j++) {
				if (al.get(k) != null) {
					arr[i][j] = al.get(k);
					k++;
				}
			}
		}
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				System.out.print(arr[i][j]+"    ");
//			}
//			System.out.println();
//		}
		return arr;
	}
	public static void main(String[] args) {
		int[][] rar = valuesint(2, 3, 5, 11, 43, 13, 44, 131, 12);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(rar[i][j] + "    ");
			}
			System.out.println();
		}
	}

}
