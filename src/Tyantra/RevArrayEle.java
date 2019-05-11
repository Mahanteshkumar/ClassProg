package Tyantra;

public class RevArrayEle {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int size = arr.length;
		int[] temp = new int[size];
		int j = size - 1;
		for (int i = 0; i < size; i++) {
			temp[j--] = arr[i];
			// j --;
		}
		System.out.println("Reversed array is: \n");
		for (int k = 0; k < size; k++) {
			System.out.print(temp[k] + " ");
		}
	}
}