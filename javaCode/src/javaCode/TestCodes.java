package javaCode;

import java.util.Scanner;

public class TestCodes {
	public static void main(String [] args) {
		for(double i = 2; i<=8; i++) {
			System.out.println("10,000 at "+ i +"% interest = "+interest(10000.0,i));
		}
	}
	public static double interest(double amount, double rate) {
		return (amount *(rate/100));
	}
}
