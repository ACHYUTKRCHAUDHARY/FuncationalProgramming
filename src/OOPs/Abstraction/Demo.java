package OOPs.Abstraction;

public class Demo {
    static void main() {
        BankAccount ba = new BankAccount(500);
        ba.deposit(500);
        ba.withdraw(400);
        System.out.println(ba.getBalance());
    }
}

class BankAccount{
    private double balance;
    public BankAccount(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount){
        this.balance += amount;
    }
    public void withdraw(double amount){
        if(this.balance >= amount){
            this.balance -= amount;
        }
        else System.out.println("Insufficient Balance");
    }
    public double getBalance(){
        return this.balance;
    }

}
