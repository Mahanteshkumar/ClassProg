package NumberPck;

public class EqiTrian {

	public static void main(String[] args) {
		int n=1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i+j>=5) {
					System.out.print(" " +n);
					n++;
				}else {
				System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
