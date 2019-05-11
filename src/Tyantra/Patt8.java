package Tyantra;

public class Patt8 {

	public static void main(String[] args) {
		/*int n = 5, k=0;
		char[] arr= {'j','a','v','a'};
		int space = n - 1; 
		for (int i = 0; i < n; i++) 
		{ 
		for (int j = 0; j <= space; j++) 
		System.out.print(" "); 
		for (int j = 0; j <= i; j++) 
			if(n/2>=k) {
			System.out.print(arr[k]+" ");
			k++;
			}else {
				System.out.print(arr[k]+" ");
				k--;
			}
				System.out.println();
				k=0;
			space--; 
		}*/ 
		int c = 3, n=4;
		int s = 1,k=0;
		char[] arr= {'j','a','v','a'};
		for (int i = 0; i < n; i++) {
			for (int j = c; j >= 1; j--) {
				System.out.print("  ");
			}
			for (int  f= 1; f<= s; f++) {
				if(n/2>k) {
					System.out.print(arr[k]+" ");
					k++;
					}else {
						System.out.print(arr[k]+" ");
						k--;
					}
			}
			System.out.println();
			k=0;
			s += 2;
			c--;
		}
	/*
		space = 0; 
	
		for (int i = n; i > 0; i--) 
		{ 
		for (int j = 0; j <= space; j++) 
				System.out.print(" "); 
			for (int j = 0; j < i; j++) 
				System.out.print("* "); 
	
			System.out.println(); 
			space++; 
		} 
*/	
	}
}