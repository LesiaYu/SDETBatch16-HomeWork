package class19.HW;

public class Task1 {
    //Create 1 class in which create a methods that will calculate
    // the area of Method name must be called calculateArea
    //Rectangle //Square//Use separate class to test your code

    void calculateArea(int rectangle, int square){
        System.out.println(rectangle*square);
    }

    void calculateArea(double rectangle, int square){
        System.out.println(rectangle*square);
    }

    void calculateArea(int rectangle, double square){
        System.out.println(rectangle*square);
    }
    void calculateArea(double rectangle, double square){
        System.out.println(rectangle*square);
    }
}

class testTask1{
    public static void main(String[] args) {

        Task1 task1=new Task1();
        task1.calculateArea(23,56);
        task1.calculateArea(23.8,56);
        task1.calculateArea(23,56.8);
        task1.calculateArea(23.9,56.8);

    }
}
