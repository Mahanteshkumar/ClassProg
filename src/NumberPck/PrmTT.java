package NumberPck;

public class PrmTT {

	public static void main(String[] args) {
		int n=2, cnt=0;
		while(cnt<=20) {
		boolean flag=true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=false;
			}
		}
		if(flag==true)
		{
			System.out.print(n+" ");
		cnt++;
		}
		n++;
		}
	}

}
