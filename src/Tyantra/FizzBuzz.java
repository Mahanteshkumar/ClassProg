package Tyantra;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if((n%4==0)&&(n%5==0))
		{
			System.out.println("Java j2ee");
		}else if(n%5==0){
			System.out.println("Java");
		}else if(n%4==0)
		{
			System.out.println("J2ee");
		}else 
		{
			System.out.println("not Divisible by 5 or 4");
		}
	}

}
