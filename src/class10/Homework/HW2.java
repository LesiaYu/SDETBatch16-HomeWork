package class10.Homework;

import java.util.SortedMap;

public class HW2 {
    public static void main(String[] args) {
        //Create 2D array of cars : american, german, korean, italian.
        //Then retrieve all values from that array using 2 different loops

        String [][] cars= {
                {"Dodge","Ford","Nissan"},
                {"Volkswagen","Mercedes-Benz","Audi"},
                {"Hyundai Tucson", "SangYong", "KIA"},
                {"Alfa Romeo","Fiat","Maserati"}
        };

            for (int i=0;i<cars.length; i++){
            for (int j=0; j<cars[i].length; j++){
                System.out.print(cars[i][j]+" ");
            }

        }
        System.out.println();


        for (int i=0; i< cars.length; i++){
            String [] car1=cars[i];
            for (int j=0; j<car1.length; j++){
                System.out.print(car1[j]+" ");
            }

        }

        }

    }

