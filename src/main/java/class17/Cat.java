package class17;

public class Cat {
    String name;
    Cat (String catName){
        name=catName;
    }

    Cat(String name, String color){
        System.out.println("2 argument constructor called");
    }

    //Cat(String color){}  not allowed

    Cat(int age){
        System.out.println("Int argument constructor");

    }

    Cat(double weight){
        System.out.println("Double argument constructor");
    }

    Cat(){
        System.out.println("0 argument constructor called");
    }

    void  printInfo(){
        System.out.println(name);
    }

        public static void main(String[] args) {

        Cat cat=new Cat("brown","white");
        //cat.printInfo();
    }
}
