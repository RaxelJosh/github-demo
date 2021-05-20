package javaCode;
import java.util.Scanner;
public class CommandLineCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do {
		Scanner in = new Scanner(System.in);
		System.out.println("Please press a function: \n[1]Add\n[2]Subtract\n[3]Multiply\n[4]Divide\n[5]Exit");
		String choice = in.nextLine();
		int num1, num2, result;
		boolean again = false;
		switch(choice) {
		case "1":
			System.out.println("Enter first number: ");
			num1 = in.nextInt();
			System.out.println("Enter second number: ");
			num2 = in.nextInt();
			result = Add(num1, num2);
			System.out.println(num1+" + "+ num2 +" = "+ result);
			System.out.println("press r to repeat");
			in.next();
			again = true;
			break;
		case "2":
			System.out.println("Enter first number: ");
			num1 = in.nextInt();
			System.out.println("Enter second number: ");
			num2 = in.nextInt();
			result = Subtract(num1, num2);
			System.out.println(num1+" - "+ num2 +" = "+ result);
			System.out.println("press r to repeat");
			in.next();
			again = true;
			break;
		case "3":
			System.out.println("Enter first number: ");
			num1 = in.nextInt();
			System.out.println("Enter second number: ");
			num2 = in.nextInt();
			result = Multiply(num1, num2);
			System.out.println(num1+" * "+ num2 +" = "+ result);
			System.out.println("press r to repeat");
			in.next();
			again = true;
			break;
		case "4":
			System.out.println("Enter first number: ");
			num1 = in.nextInt();
			System.out.println("Enter second number: ");
			num2 = in.nextInt();
			result = Divide(num1, num2);
			System.out.println(num1+" / "+ num2 +" = "+ result);
			System.out.println("press r to repeat");
			in.next();
			again = true;
			break;
		case "5":
			System.out.println("Exit Program");
			again = false;
			break;
		default:
			System.out.println("Invalid Number");
		}
		}while(true);
	}
		
		public static int Add(int num1 , int num2) {
			return num1 + num2;
	}
		public static int Subtract(int num1 , int num2) {
			return num1 - num2;
	}
		public static int Multiply(int num1 , int num2) {
			return num1 * num2;
	}
		public static int Divide(int num1 , int num2) {
			return num1 / num2;
	}
		
}
		
