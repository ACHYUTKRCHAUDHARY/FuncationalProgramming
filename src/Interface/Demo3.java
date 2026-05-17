package Interface;

public class Demo3 {
    static void main() {
        Payment p=new CreditCard();
        p.pay();
    }
}

//polymorphism
interface Payment{
    void pay();
}

class CreditCard implements Payment{
    @Override
    public void pay() {
        System.out.println("Paying via credit card");
    }
}

class DebitCard implements Payment{
    @Override
    public void pay() {
        System.out.println("Paying via debit card");
    }
}
