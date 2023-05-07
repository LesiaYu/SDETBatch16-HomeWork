package class17;

import class13.Maths;

public class Zebra {

    String name;
    String color;
    int age;
    double weight;

    static int noOfLegs;

    public Zebra(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }
    void printInfo(){
        System.out.println(name+" "+color+" "+age+" "+weight);
    }
    static void speak(){
        System.out.println("mooooooooooo boahhhhhhhhha");

    }

    public static void main(String[] args) {
        Maths math=new Maths();
    }

}
