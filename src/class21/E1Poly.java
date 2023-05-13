package class21;

public class E1Poly {

    public static void main(String[] args) {

        /*Dog dog=new Dog("Teddy","black","German");
        dog.speak();
        dog.sleep();
        dog.eat();
        Cat cat=new Cat("Jane","white","persian");
        cat.speak();
        cat.sleep();
        cat.eat();
        Horse horse=new Horse("Gery","brown","K5");
        horse.speak();
        horse.sleep();
        horse.eat();*/

      /*  Animal [] animals = new Animal[3];
        animals[0] = new Dog("Jack", "black", "German");
        animals[1] = new Cat("Tom", "blue", "Persian");
        animals[2] = new Horse("Spirit", "brown", "Arabian Horse");

        for (int i = 0; i < animals.length; i++) {
            animals[i].printInfo();
            animals[i].eat();
            animals[i].sleep();
            animals[i].speak();
        }*/

        Animal [] animals={new Dog("Teddy","black","German"),
                new Cat("Jane","white","persian"),
                new Horse("Gery","brown","K5") };

         for(Animal animal:animals){
                 animal.speak();
         animal.eat();
         animal.sleep();
       }

         Animal dogStoredInAnimal=new Dog("Teddy","black","German");
         //we must type cast the dogStoredInAnimal back to a dog to call the run method as
        //this run m
        Dog d=(Dog)dogStoredInAnimal;
        d.run();

        ((Dog)dogStoredInAnimal).run();
        int num=(int)10.5;
    }
}
