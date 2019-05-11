package NumberPck;

public class Ret2val {
	public static int[] getvalues(int a, int b) {
		int ans[]=new int[2];
		ans[0]=a+b;
		ans[1]=a*b;
		return ans;
	}

	public static void main(String[] args) {
		int[] res=getvalues(20, 50);
		for (int i = 0; i < res.length; i++) {
		System.out.println(res[i]);
		}
	}

}
