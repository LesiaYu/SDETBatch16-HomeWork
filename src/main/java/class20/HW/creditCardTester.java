package class20.HW;

public class creditCardTester {
    public static void main(String[] args) {
        CreditCard creditcard=new CreditCard();
        Visa visa=new Visa();
        AX ax=new AX();
        creditcard.calculate(34.87,54.87);
        visa.calculate(43.99,8.99);
        ax.calculate(43.00,33.76);
    }
}
