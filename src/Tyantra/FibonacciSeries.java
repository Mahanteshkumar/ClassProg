package Tyantra;

public class FibonacciSeries {

	public static void main(String[] args) {
		int first=1,second = 1, fibo=0;
		System.out.print(first+" "+second+" ");
		while(fibo<=100) {
			fibo = second+first;
			if(fibo<100) {
			System.out.print(fibo+" ");
			}
			first= second;
			second= fibo;
		}
	}
}
