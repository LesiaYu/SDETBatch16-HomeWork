package class24;

import java.util.ArrayList;

public class E9ArrayList {
    public static void main(String[] args) {

        ArrayList<String> cars=new ArrayList<>();
        cars.add("Porsh");
        cars.add("Mercedes");
        cars.add("BMW");
        System.out.println(cars);

        for (String car:cars){
            System.out.println(car);
        }

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        int j=0;
        while (j< cars.size()){
            System.out.println(cars.get(j));
            j++;
                   }

        ArrayList<String> words=new ArrayList<>();
        words.add("Hello");
        words.add("Safari");
        words.add("Popy");
        words.add("Helke");
        System.out.println(words);
      /* for (String word:words){
           if(word.endsWith("e")){
               words.remove(word);
           }
       }
        System.out.println(words);*/

        for (int i = 0; i < words.size(); i++) {
            String word=words.get(i);
            if(word.endsWith("e")){
                words.remove(i);
                i--;
            }

        }
        System.out.println(words);
    }
}
