package javaCode;
import java.util.Scanner;
public class CheckAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter Age:");
		int age = in.nextInt();
		boolean minor = false, adult = false, senior = false;
		if(age >= 1 && age <= 17) {
			 minor = true;
		}else if(age >= 18 && age <= 59) {
			 adult = true;	
		}else if(age >= 60 && age <= 120) {
			 senior = true;	
		}else if(age <= 121) {
			System.out.println("Age is not realistic.");
		}
		System.out.println("Minor? " + minor + "\nAdult? " + adult + "\nSenior? " + senior);

	}

}
