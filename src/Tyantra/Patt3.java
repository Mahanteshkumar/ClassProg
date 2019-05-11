package Tyantra;

public class Patt3 {

	public static void main(String[] args) { 
		int n=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i<=j) {
					System.out.print("  ");
				}else {
					System.out.print(" "+n);
				}
			}
			if(n==1) {
				n=0;
			}else {
				n=1;
			}
			System.out.println();
		}
	}

}
