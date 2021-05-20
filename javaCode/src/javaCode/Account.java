package javaCode;

public class Account {
    public String accountName;
    public double accountBal;
    
    public String getAccountName() {
        return accountName;
    }

    public double getAccountBal() {
        return accountBal;
    }

    public Account(String accountName, double accountBal) {
        if(accountBal < 0) {
            System.out.println("Starting balance cannot be less than zero.\nBalance set to Php0.00");
        }else {
            this.accountName = accountName;
            this.accountBal = accountBal;
            System.out.println("Account created.");
            System.out.println("nBalance set to Php" + this.accountBal);
            System.out.println("nBalance set to Php" + this.accountName);
        }
    }
    
    public void transferFunds(double withdrawal){
        if(withdrawal > this.accountBal){
            System.out.printf("Unable to transfer Php%.2f. Insufficient Balance.\n",withdrawal);
        }else if(withdrawal < 0){
            System.out.println("Transfer amount must be greater than zero. Transfer failed.");
        }else{
            this.accountBal -= withdrawal;
            System.out.printf("Transfer of Php%.2f successful. Your new balance is Php%.2f.\n",withdrawal,this.accountBal);
        }
    }

    public void addFunds(double deposit){
        if(deposit < 0){
            System.out.println("Amount deposited must be greater than zero.");
        }else {
            this.accountBal += deposit;
            System.out.printf("Deposit of Php%.2f is successful. Your new balance is Php%.2f.\n",deposit,this.accountBal);
        }
    }
}
