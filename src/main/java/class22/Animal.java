package class22;

public abstract class Animal {

    private String name;
    private String color;
   final private String breed;

    Animal(String name, String color, String breed){
        this.name=name;
        this.color=color;
        this.breed=breed;
    }
    abstract void speak();
    abstract void eat();
    abstract void sleep();
    void printInfo(){
        System.out.println(name+" "+color+" "+breed);
    }
}

class Dog extends Animal{
    Dog(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
    void speak(){
        System.out.println("Woof woof");
    }
    @Override
    void eat(){
        System.out.println("chewing bones");
    }
    @Override
    void sleep(){
        System.out.println("Dog sleeeeep");
    }
}

class Cat extends Animal{
    Cat(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
    void speak(){
        System.out.println("Meow meow");
    }
    @Override
    void eat(){
        System.out.println("Cat likes eat fish");
    }
    @Override
    void sleep(){
        System.out.println("Cat sleeeeep");
    }
}

class Horse extends Animal{
    Horse(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
    void speak(){
        System.out.println("UUUUUUUU");
    }
    @Override
    void eat(){
        System.out.println("Horse likes eat sino");
    }
    @Override
    void sleep(){
        System.out.println("Horse sleeeeep");
    }
}