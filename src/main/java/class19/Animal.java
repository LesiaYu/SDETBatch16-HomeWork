package class19;

public class Animal {

    private String  name;
    String breed;
    String color;
    int age;
    double weight;

    public Animal(String name, String breed, String color, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }
    void printInfo(){
        System.out.printf(name+" "+breed+" "+color+" "+age+" "+weight);
    }

}
class Dog extends Animal{
    double price;
    public Dog(String name, String breed, String color, int age, double weight, double price){
    super(name,breed,color,age,weight);
    this.price=price;

    }
    void printInfo(){    //reusing the print Info method from parent class by using super keyword
        super.printInfo();
        System.out.print(" "+price);
    }
}

class Cat extends Animal{
    public Cat(String name, String breed, String color, int age, double weight){
        super(name,breed,color,age,weight);
    }
}

class Horse extends Animal{

    public Horse(String name, String breed, String color, int age, double weight) {
        super(name, breed, color, age, weight);
    }
}
class AnimalTester{
    public static void main(String[] args) {
        Dog dog=new Dog ("Tom","Black", "persian", 10,20,2000);
        dog.printInfo();
    }



}