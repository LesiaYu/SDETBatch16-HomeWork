package GroupTasks2;

public class Car8 {

    //Create a Class Car that would have the following fields: carPrice and
    //color and method calculateSalePrice() which should be returning a
    //price of the car.
    //Create 2 sub classes: Sedan and Truck. The Truck class has a field
    //as weight and has its own implementation of calculateSalePrice()
    //method in which returned price is calculated as following: if
    //weight>2000 then returned price car should include 10% discount,
    //otherwise 20% discount.
    //The Sedan class has field as length and also does it is own
    //implementation of calculateSalePrice(): if length of sedan is >20 feet
    //then returned car price should include 5% discount, otherwise 10%
    //discount

    int carPrice;
    String colour;

    Car8(String colour,int carPrice){
        this.colour=colour;
        this.carPrice=carPrice;
    }
    public double calculateSalePrice(){
       return carPrice;
    }
}
class Sedan extends Car8 {
    int length;

    Sedan(String colour, int carPrice, int length) {
        super(colour, carPrice);
        this.length = length;
    }

    @Override
    public double calculateSalePrice() {
        if (length > 20) {
           carPrice=carPrice - (5 * carPrice / 100);
        } else {
            carPrice =carPrice - (10 * carPrice / 100);
        }
        return carPrice;
    }
}
class Truck extends Car8 {
    int weight;

    Truck(String colour, int carPrice, int weight) {
        super(colour, carPrice);
        this.weight = weight;
    }

    @Override
    public double calculateSalePrice() {
        if (weight > 2000) {
            carPrice=carPrice - (10 * carPrice / 100);
        } else {
            carPrice =carPrice - (20 * carPrice / 100);
        }
        return carPrice;
    }
}

class Car8Tester{
    public static void main(String[] args) {

        Car8 sedan=new Sedan("Brown",25000, 19);

       double result= sedan.calculateSalePrice();
        System.out.println("Price of the car Sedan include discount is "+ result);


       Car8 truck=new Truck("white",1000,1001);
        double result1=truck.calculateSalePrice();
        System.out.println("Price of the car Truck include discount is "+result1);
      }
    }


