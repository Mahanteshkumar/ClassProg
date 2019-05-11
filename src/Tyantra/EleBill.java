package Tyantra;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class EleBill {

	public static void main(String[] args) {
		System.out.println("Enter the units :");
		Scanner sc = new Scanner(System.in);
		int units = sc.nextInt();
		System.out.println("Enter the arrears if any :");
		double arrears = sc.nextDouble();
		LocalDate date= LocalDate.now();
		Month mon = date.getMonth();
		int year = date.getYear();
		double total_amount = 0, amount = 0, discount= 0, fine= 0;
		if(units<=50) {
			amount = units*1.2;
		}else if(units>=50 && units<=100){
			double first_units = 50*1.2;
			units-=50;
			amount=first_units+(units*2.4);
		}else if(units>=100 && units<=150) {
			double first_units = 50*1.2;
			double snd_units = 50*2.4;
			units-=100;
			amount=first_units+snd_units+(units*3.6);
		}else if(units>150 && units<=200) {
			amount=units*4.8;
		}else{
			amount = units*4.8;
			discount = amount * 0.05;
			if(discount>200) {
				discount=200;
			}
		}
		if(arrears>0) {
			fine = amount + (amount*0.1);
		}
		total_amount =amount+arrears+fine-discount;
		System.out.println("Electricity bill of "+mon+"/"+year+" : "+total_amount);
		System.out.println("Last day to pay bill :  "+date.plusDays(15));
	}
}