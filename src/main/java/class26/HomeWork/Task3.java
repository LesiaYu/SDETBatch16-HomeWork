package class26.HomeWork;

import java.util.LinkedHashSet;

public class Task3 {
    public static void main(String[] args) {

        //Create the collection that will store single uniques
        // Objects of a String type in which order is preserved.
        //Write a logic to concatenate all string from the collection.

        LinkedHashSet<String> singleUniques=new LinkedHashSet<>();
        singleUniques.add("Hello!");
        singleUniques.add("My");
        singleUniques.add("name");
        singleUniques.add("is");
        singleUniques.add("Lesia.");

        for(String s:singleUniques) {
            System.out.print(s.toString()+" ");
        }

    }
}
