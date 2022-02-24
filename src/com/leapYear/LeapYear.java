package com.leapYear;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		System.out.println("Please Enter the year to check for Leap Year in format YYYY:");

		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

		System.out.println(year);

		if (year % 4 == 0 && year % 400 != 0) {
			System.out.println("The entered year" + " " + year + " " + "is a leap year");
		} else {
			System.out.println("The entered year" + " " + year + " " + "is a not leap year");
		}

		sc.close();
	}
}
