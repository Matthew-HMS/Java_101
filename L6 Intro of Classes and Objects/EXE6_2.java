public class EXE6_2{
    private String name;
    private int AccountNumber;
    private double balance;

    public EXE6_2(String name, int AccountNumber, double balance){
        setName(name);
        setAccountNumber(AccountNumber);
        setBalance(balance);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAccountNumber(int AccountNumber){
        this.AccountNumber = AccountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public String getName(){
        return name;
    }

    public int getAccountNumber(){
        return AccountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    public String toString(){
        return "\nName: " + name + "\nAccount Number: " + AccountNumber + "\nYour current Balance: " + balance;
    }
}