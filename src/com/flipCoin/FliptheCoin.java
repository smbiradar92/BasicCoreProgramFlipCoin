package com.flipCoin;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FliptheCoin {

	public static void main(String[] args) {
		System.out.println("Enter Number of times to flip the coin");

		DecimalFormat decimalFormat = new DecimalFormat("##.00");

		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();

		int Tailcount = 0;
		int Headcount = 0;

		for (int cnt = 0; cnt < count; cnt++) {
			if (Math.random() < 0.5) {
				Tailcount++;
			} else {
				Headcount++;
			}
		}

		System.out.println("Tail count is : " + Tailcount);
		System.out.println("Head count is : " + Headcount);

		String TailPercentage = decimalFormat.format(((double) Tailcount / count) * 100);
		String HeadPercentage = decimalFormat.format(((double) Headcount / count) * 100);
		 
		System.out.println("The tail percentage is : " + TailPercentage + " %");
		System.out.println("The Head percentage is : " + HeadPercentage +" %");
		
		sc.close();
	}
}
