package module3;

public class BankAccount {
    private final String accountNumber;
    private double balance;

    private String accountName;

    // Constructor method
    public BankAccount(String accountNumber, double balance, String accountName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountName = accountName;
    }

    //Instance method to deposit
    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposit: " + amount + " into account: "+ accountNumber + " Name: " + accountName);
    }

    //Instance method to withdraw
    public void withdraw(double amount){
        if(balance>= amount){
            balance -= amount;
            System.out.println("Withdraw: " + amount + " from account: "+ accountNumber+ " Name: " + accountName);
        }
        else{
            System.out.println("Insufficient funds in account: "+ accountNumber+ " Name: " + accountName);
        }
    }

    // Accessor method
    public double getBalance(){
        return balance;
    }
    // static method
    public static void transfer(BankAccount fromAccount, BankAccount toAccount, double amount){
        if(fromAccount.balance>=amount){
            fromAccount.balance -= amount;
            toAccount.balance += amount;
            System.out.println("Transfer: " + amount + " from Account: "+ fromAccount.accountNumber + " to account: " + toAccount.accountNumber);
        }
        else{
            System.out.println("Insufficient funds in account: "+ fromAccount.accountNumber + " for the transfer");
        }
    }

    public static void main(String[] args) {
        // creating bank accounts
        BankAccount account1 = new BankAccount("1111",1000.0,"Superman");
        BankAccount account2 = new BankAccount("2222", 2000.0,"Green");
        BankAccount account3 = new BankAccount("3333", 5000.0, "Batman");

        // Depositing money into account1
        account1.deposit(500.0);

        // Withdrawing money from account2
        account2.withdraw(500.0);

        // Transfer money from account1 to account2
        BankAccount.transfer(account1, account2, 300.0);

        // Display final balance
        System.out.println("Final balance of account1 "+ account1.getBalance());
        System.out.println("Final balance of account2 "+ account2.getBalance());
    }
}
