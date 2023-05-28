package class21;

public class Refresher {

    public static void main(String[] args) {

        int number=10;
        int [] arr={number,20,30};
        for (int num:arr) {
            System.out.println(num);
        }

        String [] names={new String("Vlad"), "Marina", "Veronica"};
        for (String name:names){
            System.out.println(name.length());
        }

        Dog dog1=new Dog("Lal", "Black", "Persian");
        Dog [] dogs={dog1, new Dog ("Papi","White","chinese")};
        for (Dog dog:dogs){
            dog.printInfo();
        }

        // Dog [] dogs={new Dog("Lal", "Black", "Persian"), new Dog ("Papi","White","chinese")};
        //Dog d=dogs[0];
        //d.printInfo();

        for (int i = 0; i < dogs.length; i++) {
            dogs[i].printInfo();
        }
        for(Dog d:dogs){
            d.printInfo();
        }
    }
}
