package class12;

public class CarTester {
    public static void main(String[] args) {

        Car car=new Car();
        car.make="Toyota";
        car.model="Camry";
        car.colour="White";
        car.mileage=0;
        car.isAutomatic=true;

        car.stopCar();

        Car car1=new Car();
        car1.make="Tesla";
        car1.model="Tesla XP";
        car1.colour="red";
        car1.mileage=15000;
        car1.isAutomatic=true;

        car1.startCar();
        car1.breakDown();



    }
}
