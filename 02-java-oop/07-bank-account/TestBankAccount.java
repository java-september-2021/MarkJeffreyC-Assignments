public class TestBankAccount {
    public static void main(String[] args){

        BankAccount myAccount = new BankAccount();
        BankAccount secondAccount = new BankAccount();
        BankAccount thirdAccount = new BankAccount();

        myAccount.deposit("checking", 100);
        myAccount.deposit("savings", 200);
        myAccount.displayAccount();

        secondAccount.deposit("checking", 50);
        secondAccount.deposit("savings", 50);
        secondAccount.displayAccount();

        System.out.printf("Total Number of Accounts: %.0f\n", BankAccount.accountsCreated());
        System.out.printf("Total Amount Stored in Bank: $%.2f\n", BankAccount.allAccountsTotal());

    }
}
