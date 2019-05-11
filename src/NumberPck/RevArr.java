package NumberPck;

public class RevArr {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int size = arr.length;
		int[] temp = new int[size];
		int j = size;
		for (int i = 0; i < size; i++) {
			temp[j - 1] = arr[i];
			j = j - 1;

		}
		System.out.println("Reversed array is: \n");
		for (int k = 0; k < size; k++) {
			System.out.print(temp[k] + " ");
		}
	}
}