package class20;

public class Animal {

    String name;
    String color;
    String  breed;
    int age;

    Animal(String name, String color, String breed, int age){
        this.name=name;
        this.color=color;
        this.breed=breed;
        this.age=age;
    }

 
    void sleep(){
        System.out.println("ZZZZZZZ");
    }
    void eat(){
        System.out.println("eating");
    }
    void speak(){
        System.out.println("speaking");
    }



}
