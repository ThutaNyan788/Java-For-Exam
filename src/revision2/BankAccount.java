package revision2;

public class BankAccount {
    String name;String number ; int balance;
    BankAccount(String name,String number,int balance){
        this.name = name;
        this.number = number;
        this.balance = balance;
    }

    public int deposit(int amount){
        balance += amount;
        return balance;
    }

    public int withdraw(int amount){
        if(balance < amount){
            System.out.println("Balance is insufficient");
        }else{
            balance -= amount;
        }
        return balance;

    }
}
