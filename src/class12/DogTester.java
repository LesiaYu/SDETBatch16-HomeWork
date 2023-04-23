package class12;

public class DogTester {
    public static void main(String[] args) {

        Dog actualDog=new Dog();
        actualDog.name="Jacky";
        actualDog.age=50;
        actualDog.breed="German";
        actualDog.colour="Black";
        actualDog.weight=50;

        actualDog.bark();

        Dog obj=new Dog();
        obj.name="Taddy";
        obj.age=2;
        obj.breed="Terier";
        obj.colour= "White";
        obj.weight=5;
        obj.isFat=false;

        obj.eat();

    }


}
