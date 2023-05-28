package class25.HomeWork;

import java.util.ArrayList;
import java.util.List;

public abstract class Insuarance {
    //Create a class Insurance that will have an attribute as insuranceName
    // and unimplemented behaviour as getQuote and cancelInsurance.
    // Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute
    // as carModel and Class Pet has petType attribute. Create 3 objects of the sub classes
    // and store them in ArrayList. Using for loop/advanced for loop/ iterator access all
    // methods of the class.

    String insuranceName;

    public Insuarance(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public abstract void getQuote();

    public abstract void cancelInsuranceName();

    public static void main(String[] args) {

        Car car = new Car("Porsh", "insurancePorsh");
        Pet pet = new Pet("ToyTerier", "insuranceToy");
        Health health = new Health("insuranceHealth");

        List<Insuarance> list = new ArrayList<>();
        list.add(car);
        list.add(pet);
        list.add(health);

        for (Insuarance l : list) {
            l.getQuote();
            l.cancelInsuranceName();
            System.out.println(l.toString());

        }
    }
}
class Car extends Insuarance {
        String carModel;

        public Car(String carModel, String insuranceName) {
            super(insuranceName);
            this.carModel = carModel;
        }

        @Override
        public void getQuote() {
            System.out.println("Car Insurance quote " + carModel);
        }

        @Override
        public void cancelInsuranceName() {
            System.out.println("Car insurance cancelled " + insuranceName);
        }

        @Override
        public String toString() {
            return "Car{" +
                    "carModel='" + carModel + '\'' +
                    ", insuranceName='" + insuranceName + '\'' +
                    '}';
        }
}
class Pet extends Insuarance{

    String petType;
    Pet(String petType, String insuranceName){
        super(insuranceName);
        this.petType=petType;
    }
    @Override
    public void getQuote(){
        System.out.println("Pet Insurance quote "+petType);
    }
    @Override
    public void cancelInsuranceName(){
        System.out.println("Pet insurance cancelled "+insuranceName);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "petType='" + petType + '\'' +
                ", insuranceName='" + insuranceName + '\'' +
                '}';
    }
}
class Health extends Insuarance{

    public Health(String insuranceName){
        super(insuranceName);
    }

    @Override
    public void getQuote(){
        System.out.println("Health Insurance quote");
    }

    @Override
    public void cancelInsuranceName(){
        System.out.println("Health insurance cancelled "+insuranceName);
    }

    @Override
    public String toString() {
        return "Health{" +
                "insuranceName='" + insuranceName + '\'' +
                '}';
    }
}
