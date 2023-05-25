package class22;

public class AnimalTester {
    public static void main(String[] args) {

        //Animal an=new Animal(); - error, class Animal abstract

        Animal[] animals = {new Dog("jacky","black", "unknown"),
                new Cat("Tom","blue", "persian"),
                new Horse("jac","white", "German")};

        for (Animal anim : animals) {
            anim.eat();
            anim.sleep();
            anim.speak();
            anim.printInfo();
        }
    }
}
