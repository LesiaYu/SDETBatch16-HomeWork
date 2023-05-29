package class26;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {

        TreeMap<String, String> countries=new TreeMap<>();
        countries.put("Ukraine", "Kiev");
        countries.put("Poland", "Warsaw");
        countries.put("Germany", "Berlin");
        countries.put("England","London");
        System.out.println(countries);

        //Set<String> countrySet=countries.keySet();
        for(String co:countries.keySet()){
            System.out.println(co);
        }
        System.out.println("**********************");

        for(String v:countries.values()){
            System.out.println(v);
        }

        System.out.println("**********************");

        Set<Map.Entry<String, String>> count=countries.entrySet();
        for(Map.Entry<String, String> c:count){
            System.out.println(c);
        }

        System.out.println("**********************");

         for (var e:countries.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
}       }
    }

