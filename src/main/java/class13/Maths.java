package class13;

public class Maths {

    void add(int num1,int num2){
        System.out.println(num1+num2);

    }
    void multiply(int num1,int num2){
        System.out.println(num1*num2);}

    public static void main(String[] args) {
        Maths math=new Maths(); //creating object of Maths class
        math.add(10,10);        // calling the method
        math.multiply(5,5);
    }
}
