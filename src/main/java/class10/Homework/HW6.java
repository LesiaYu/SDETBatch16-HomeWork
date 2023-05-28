package class10.Homework;

import java.util.SortedMap;

public class HW6 {
    public static void main(String[] args) {
        //Create 2D array of countries: north america countries, south america countries, europe countries, asian countries, african countries.
        //Then print all values from that array using 2 different loops and calculate how many total countries been stored.

        String [][] countries={
                {"Toronto", "Las Vegas","Mexico", "New York"},
                {"Peru","Lima","Brazil"},
                {"Warzawa","Kyiv","London","Paris"},
                {"Maldives","Cyprus","Honkong"},
                {"Chad", "Comoros", "Congo", "Ivory", "Liberia"}

        };
        int sum=0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j]+" ");
                sum++;
            }
            System.out.println();

            } System.out.println(sum);

        int sum2=0;
        for (String []country:countries){
            for (String coun:country){
                System.out.print(coun+" ");
                sum2++;
            }
            System.out.println();
        }
        System.out.println(sum2);
        }

        }