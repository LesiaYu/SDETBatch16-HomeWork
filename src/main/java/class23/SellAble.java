package class23;

public interface SellAble {
    int PRICE=12;
    static void sell(){
        System.out.println("Allowed");
    }
}
class Tester1{

    public static void main(String[] args) {
        SellAble.sell();
    }
}
