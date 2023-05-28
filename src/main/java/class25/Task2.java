package class25;

import java.util.ArrayList;
import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {

        TreeSet <String> countries=new TreeSet<>();
        countries.add("USA");
        countries.add("Ukraine");
        countries.add("France");
        countries.add("Germany");
        countries.add("Pakistan");

        System.out.println(countries);

        for(String c:countries){
            System.out.println(c);
        }

        ArrayList<String> names=new ArrayList<>(countries);
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));

        }




    }
}
