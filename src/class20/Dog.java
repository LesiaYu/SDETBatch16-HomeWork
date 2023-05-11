package class20;

public class Dog extends Animal{

    Dog(String name, String color, String breed, int age){
        super(name,color, breed,age);
    }

    @Override
    void sleep( ){
        System.out.println("L like to sleep 10.6 hours a day");
           }



}
