package NumberPck;

public class RevTri {

	public static void main(String[] args) {
		int n=10;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i<=j) {
					System.out.print(n+" ");
					n--;
				}else {
				System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
