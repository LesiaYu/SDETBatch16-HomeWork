package class21.HW;

public class Computer {

    //Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    //Define common behavior within and some fields in parent class and override some of the methods in child classes
    //Define some methods specific to child classes
    //Create objects of child classes and store them into array. Loop through each object and execute available methods.

    String model;
    int year;
    int number;
    double price;

    Computer(String model,int year, int number,double price){
        this.model=model;
        this.year=year;
        this.number=number;
        this.price=price;
    }

    void work(){
        System.out.println("The computer works good");
    }

    void stop(){
        System.out.println("The computer broke down");
    }

    void provide(){
        System.out.println("The computer provides training");
    }

}
class Apple extends Computer{

    Apple(String model,int year, int number,double price){
        super(model,year,number,price);
    }
    @Override
    void work(){
        System.out.println("The Apple"+model+" works good ");
    }
    @Override
    void stop(){
        System.out.println("The Apple broke down");
    }
    void does(){
        System.out.println("Apple"+model+" "+number+" is very good");
    }
}

class Lenovo extends Computer{
    Lenovo(String model,int year, int number, double price){
        super(model,year,number, price);
    }
    @Override
    void work(){
        System.out.println("The Lenovo "+model+" works good ");
    }
    @Override
    void stop(){
        System.out.println("The Lenovo broke down");
    }
    @Override
    void provide(){
        System.out.println("The  Lenovo provides training");
    }
}

class HP extends Computer{
    HP(String model,int year, int number, double price){
        super(model,year,number,price);
    }
    @Override
    void work(){
        System.out.println("The HP "+model+" works good ");
    }
    @Override
    void stop(){
        System.out.println("The HP broke down");
    }

    void make(){
        System.out.println(model+"can to perform some tasks");
    }
}

class Dell extends Computer{
    Dell(String model,int year, int number, double price){
        super(model,year,number,price);
    }
    @Override
    void work(){
        System.out.println("The Dell "+model+" works good");
    }
    @Override
    void stop(){
        System.out.println("The Dell broke down");
    }
    void provide(){
        System.out.println("The Dell provides training");
    }
}