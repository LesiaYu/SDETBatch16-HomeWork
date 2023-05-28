package class25;

import java.util.LinkedHashSet;

public class Task3 {
    public static void main(String[] args) {

        LinkedHashSet<String> countries=new LinkedHashSet<>();
        countries.add("USA");
        countries.add("Ukraine");
        countries.add("France");
        countries.add("Germany");
        countries.add("Pakistan");
        countries.add("Germany");
        countries.add("Albania");

        System.out.println(countries);

        countries.removeIf(x->x.startsWith("A"));
        System.out.println(countries);
    }
}
