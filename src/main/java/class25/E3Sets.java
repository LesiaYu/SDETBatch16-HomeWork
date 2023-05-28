package class25;

import java.util.ArrayList;
import java.util.HashSet;

public class E3Sets {
    public static void main(String[] args) {

        ArrayList <String> names=new ArrayList<>();
        names.add("Farwa");
        names.add("Farwa");
        System.out.println(names);
        System.out.println(names.get(0));

        HashSet<String> uniqNames=new HashSet<>();
        uniqNames.add("Yellow");
        uniqNames.add("Yellow");
        uniqNames.add("green");
        System.out.println(uniqNames);
       // System.out.println(uniqNames.get());

        for(String name:uniqNames){
            System.out.println(name);
        }


    }
}
