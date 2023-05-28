package class18;

public class D {

        static void printF() {
            System.out.println("Java");
        }
    }

class E extends class18.D {
    public static void main(String[] args) {
        class18.D obj = new class18.D();
        obj.printF();
    }
}