import java.util.Random;

public class BankAccount {
    private double checking;
    private double savings;
    private String accountNumber;
    private static double numberOfAccounts = 0;
    private static double totalAmountStored = 0;

    public BankAccount(){
        this.checking = 0;
        this.savings = 0;
        numberOfAccounts++;
        this.accountNumber = genAccount();
    }

    private String genAccount(){
        Random r = new Random();
        String gAccount = "";
        for (int i = 0; i < 10; i++){
            int randomNumber = r.nextInt(10);
            gAccount += String.valueOf(randomNumber);
        }
        return gAccount;
    }

    public static double accountsCreated(){
        return numberOfAccounts;
    }

    public static double allAccountsTotal(){
        return totalAmountStored;
    }

    public double getChecking(){
        return this.checking;
    }

    public double getSavings(){
        return this.savings;
    }

    public void deposit(String account, double amount){
        if (account.equals("checking")){
            this.checking += amount;
        } else {
            this.savings += amount;
        }
        totalAmountStored += amount;
    }

    public void withdraw(String account, double amount){
        if (account.equals("checking")){
            this.checking -= amount;
        } else {
            this.savings -= amount;
        }
        totalAmountStored -= amount;
    }

    public void displayAccount(){
        System.out.printf("Account Number: %s\n", this.accountNumber);
        System.out.printf("Checking Acct Balance: $%.2f\n", this.checking);
        System.out.printf("Savings Acct Balance: $%.2f\n", this.savings);
    }

}
