package class17.HW;

public class Task2 {
    //Write a java class that have 4 constructors with 4 different access levels of constructors
    // private,public,default,protected) and create 4 objects of this class:
    // 1 - inside same class; 2 - from outside the class; 3 - from different
    // class inside different package  and observe result.
     //Write program that have static constructor and observe result.
     String name;
     int age;
     double weight;
     char grade;

     private Task2(String name){
         this.name=name;
     }                              // private constructor are accessed only from withing the class


    public Task2(int age){
        this.age=age;
    }                             //public constructor are accessed in same class, in same package,different class and different package

    Task2(double weight){
        this.weight=weight;
    }                              //default constructor are accessed in all classes inside same package


    protected Task2(char grade){
         this.grade=grade;
     }                             //protected constructor are accessed in all classes inside same package

    public static void main(String[] args) {
        Task2 task2=new Task2("Lesia");
        Task2 task21=new Task2(13);
        Task2 task22=new Task2(54.3);
        Task2 task23=new Task2('A');
    }


}
