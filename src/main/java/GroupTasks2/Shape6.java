package GroupTasks2;

public interface Shape6 {
    //Create an Interface 'Shape' with undefined methods as calculateArea
    //and calculatePerimeter. Create 2 classes Circle & Square that
    //implements functionality defined in the Shape Interface. Test your
    //code.
    double calculateArea();
    double calculatePerimeter();
}

class Circle implements Shape6 {
   double r;
    Circle(double r){
        this.r=r;
    }
@Override
    public double calculatePerimeter() {
       double perimeter= 2 * Math.PI * r;
       return perimeter;
    }
@Override
    public double calculateArea() {
       double area=Math.PI * r * r;
       return area;
    }
}
class Square implements Shape6{
    double length1;
    double length2;

    Square(double length1, double length2){
        this.length1=length1;
        this.length2=length2;
    }
@Override
    public double calculatePerimeter(){
        double perimeter=length1+length2;
        return perimeter;
    }
@Override
    public double calculateArea() {
        double area=length1*length2;
        return area;
    }
}
class ShapeTest{
    public static void main(String[] args) {

        Shape6 circle=new Circle(3);
        double result=circle.calculateArea();
        System.out.println("The area of the circle is "+result);
        double result2=circle.calculatePerimeter();
        System.out.println("The perimeter of the circle is "+result2);

        Shape6 square=new Square(3,6);
        double result3=square.calculatePerimeter();
        System.out.println("The perimeter of square is "+result3);
        double result4=square.calculateArea();
        System.out.println("The area of the square is "+result4);

    }







}