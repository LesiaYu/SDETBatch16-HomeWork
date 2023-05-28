package class21;

public class Student {

    //Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
    //Define common behavior within parent class and override some of the methods in child classes
    //Define some methods specific to child classes
    //Write example of achieving run time polymorphism

    void study(){
        System.out.println("I need study");
    }

    void sleep(){
        System.out.println("I want to sleep");
    }

    void feel(){
        System.out.println("I feel so good");
    }

}
class SyntaxStudent extends Student{

    @Override
    void study(){
        System.out.println("We must study");    }
    @Override
    void sleep(){
        System.out.println("We do not want to sleep");
    }
    void talk(){
        System.out.println("syntax is very important");
    }
}

class CollegeStudent extends Student{

    @Override
    void study(){
        System.out.println("We do not want to study");
    }
    @Override
    void sleep(){
        System.out.println("We need to sleep");
    }

}

class SchoolStudent extends Student{
    @Override
    void study(){
        System.out.println("Study is bad");
    }
    @Override
    void sleep(){
        System.out.println("Sleep as much as we want");
    }
    void go(){
        System.out.println("I want home");
    }
}
