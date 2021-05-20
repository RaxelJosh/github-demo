package javaCode;
import java.util.Scanner;
public class CheckMultiplesOf3Or5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		int num = in.nextInt();
		
		boolean check = false;
		if (num % 3 == 0 && num % 5 == 0) {
			check = true;		
		}else{
			check = false;
		} 
		System.out.println("Is the number " + num + " either a multiple of 3 or 5? " + check);
	}

}
