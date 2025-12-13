package entities;

public class Account {
    private final int accountNumber;
    private String accountHolder;
    private double balance;

    public Account(int accountNumber, String accountHolder, double initialDeposit){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialDeposit;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double deposit){
        balance += deposit;
    }

    public void withdraw(double withdraw){
        balance -= withdraw + 5;
    }

    @Override  
    public String toString(){
        return "Account: " + accountNumber + ", Holder: " + accountHolder + ", Balance: $ " + String.format("%.2f", balance);
    }
}
