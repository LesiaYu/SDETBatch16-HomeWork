package class17;

import java.util.Scanner;

public class DogTester {
    public static void main(String[] args) {

       /* Dog obj=new Dog();
        obj.name="Teddy";
        obj.color="black";
        obj.breed="Terrier";
        obj.age=2;
        obj.ptintInfo();

        Dog obj1=new Dog();
        obj1.name="Ted";
        obj1.color="white";
        obj1.breed="Kelpie";
        obj1.age=5;
        obj1.ptintInfo();

        Dog obj2=new Dog();
        obj2.name="Jek";
        obj2.color="grey";
        obj2.breed="Bulldog";
        obj2.age=1;
        obj2.ptintInfo();

        Dog obj3=new Dog();
        obj3.name="Gery";
        obj3.color="black";
        obj3.breed="Bologneze";
        obj3.age=4;
        obj3.ptintInfo();

        Dog obj4=new Dog();
        obj4.name="Bill";
        obj4.color="blackAndWhite";
        obj4.breed="Collie";
        obj4.age=6;
        obj4.ptintInfo();*/

        Dog dog1=new Dog("Jack","black","persian",12);
        Dog dog2=new Dog("shaggy","white","Husky",8);
        Dog dog3=new Dog("Fluffy", "Pink","British",7);
        Dog dog4=new Dog("Papi","brown","Asian",6);
        Dog dog5=new Dog("Papi2","brownBlack","Asian",4);
           dog1.ptintInfo();
           dog2.ptintInfo();
           dog3.ptintInfo();
           dog4.ptintInfo();
           dog5.ptintInfo();

        Scanner scanner=new Scanner(System.in);
    }
}
