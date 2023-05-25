package class24;

import java.util.ArrayList;

public class E12ArrayListTask {
    public static void main(String[] args) {
//Create an arrayList of drinks.
// If any drink has letter “a” or “e” replace it with water.

        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Coca");
        drinks.add("coffee");
        drinks.add("tea");
        drinks.add("water");
        drinks.add("juice");

       /* for (int i = 0; i < drinks.size(); i++) {
            String word=drinks.get(i);
            if(word.contains("e") || word.contains("a")){
                drinks.set(i,"Water");
            }
        }*/

         drinks.replaceAll((x->{
            if(x.contains("a")|| x.contains("e"))
                return "Water";
            else
                return x;

        }));

        //drinks.replaceAll((x-> x.contains("a")|| x.contains("e")?"Water":x);
        System.out.println(drinks);
    }
}
