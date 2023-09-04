package com.gl.lab2.driver;

import java.util.Scanner;

public class MainPayMoney {

	public static void main(String[] args) {

		System.out.println("Enter the size of transaction array ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] values = new int[size];
		System.out.println("Enter values of the array");
		for (int i = 0; i < size; i++) {
			values[i] = sc.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved");
		int total_num = sc.nextInt();
		System.out.println("Enter the value of target");
		int target = sc.nextInt();
		int sum_amt = 0;
		int i;
		for (i = 0; i < size; i++) {
			sum_amt = sum_amt + values[i];
			if (sum_amt >= target) {
				System.out.println("Target achieved after " + (i + 1) + " transactions");
				break;
			}
		}
		if ((sum_amt < target) && (i > total_num - 1)) {
			System.out.println("Given target is not achieved ");
		}
		sc.close();
	}
}
