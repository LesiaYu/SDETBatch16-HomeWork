package class21;

class Animal{

    String name;
    String color;
    String bread;

    Animal(String name, String color, String bread){
        this.name=name;
        this.color=color;
        this.bread=bread;
    }

    void printInfo(){
        System.out.println(name+" "+color+" "+bread);
    }

    void speak(){
        System.out.println("Animals speak");
    }
    void sleep(){
        System.out.println("Animals sleep from 1 to 20 hours a day");
    }
    void eat(){
        System.out.println("Animals eat many different things");
    }
}

class Cat extends Animal{
    Cat(String name, String color, String bread){
        super(name,color,bread);
    }
    @Override
    void speak(){
        System.out.println("Meow meow........");
    }
    @Override
    void eat(){
        System.out.println("Cats likes to eat Fish");
    }
        @Override
    void sleep(){
        System.out.println("Cats like to sleep 15 hours on Average");
    }
}
public class Dog extends Animal{
    Dog(String name, String color, String bread){
        super(name,color,bread);
    }
    @Override
    void speak(){
        System.out.println("woof woof........");
    }
    @Override
    void sleep(){
        System.out.println("Dogs sleep 8 hours");
    }

    void run(){
        System.out.println("Dog can run Fast");
    }
    @Override
    void eat(){
        System.out.println("Dogs like to chew the bones");
    }
}

class Horse extends Animal{

    Horse(String name, String color, String bread){
        super(name,color, bread);
    }
    @Override
    void speak(){
        System.out.println("Neight neight.......");
    }
    @Override
    void eat(){
        System.out.println("Hors like Carrots+ Grass");
    }
    @Override
    void sleep(){
        System.out.println("Horses sleep 2-3 hours");
    }
}
class AnimalTester{

    public static void main(String[] args) {

        Dog dog=new Dog("shaggy", "black", "German");
        dog.printInfo();

        //Parent class variables can store the object of the child class
        Animal dog1=new Dog("shaggy", "black", "German");
        dog1.printInfo();

        Animal [] animals={new Dog("shaggy", "black", "German"), new Cat("Tom","brown","persian")};
        for(Animal animal:animals ){
            animal.printInfo();
        }

        //type casting (widening)
        double d=10;
        Animal dog2=new Dog("gfd","hhhh","jjjj");

        int g=(int)10.5;
        //Dog dpg3= new Animal("gfd","hhhh","jjjj");
    }
}
