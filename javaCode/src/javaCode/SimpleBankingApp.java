package javaCode;

import java.util.Scanner;

public class SimpleBankingApp {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        int choice;
        String accountName;
        double startBalance;

        System.out.println("Please enter your details below.");
        System.out.println("Account Name: ");
        accountName = in.nextLine();
        System.out.println("Starting Balance: ");
        startBalance = in.nextDouble();
        Account account = new Account(accountName,startBalance);
        
        while(!quit){
            MainMenu();
            choice = in.nextInt();
            switch(choice){
                case 1:
                    System.out.printf("Account Name: %s\nAccount Balance: $%.2f\n",account.getAccountName(),
                            account.getAccountBal());
                    break;
                case 2:
                    System.out.println("Enter amount to be added: ");
                    account.addFunds(in.nextDouble());
                    break;
                case 3:
                    System.out.println("Enter amount to be transferred: ");
                    account.transferFunds(in.nextDouble());
                    break;
                case 4:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
        in.close();
    }

    public static void MainMenu(){
    	System.out.println("------------------------------");
    	System.out.println("Please select your transaction:");
    	System.out.println(" 1 - Check Balance\n 2 - Add Funds\n 3 - Transfer Funds\n 4 - Exit the program\n");
    	System.out.print("Choice:");
    }
}

