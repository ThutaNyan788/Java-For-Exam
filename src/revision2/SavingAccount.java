package revision2;

public class SavingAccount extends BankAccount{
    SavingAccount(String accNumber, String accName, int bal)
    {
        super(accNumber, accName, bal);
    }

    public double withdraw(double amount) {
        if(amount<100) {
            System.out.println("Invalid Transaction!");
        }
        else if(balance < amount) {
            System.out.println("Withdraw amount is not enough!");
        }
        else {
            super.balance -= amount; // b_account.balance -= amount;
        }
        return super.balance;
    }
}
