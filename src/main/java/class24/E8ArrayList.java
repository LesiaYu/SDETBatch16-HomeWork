package class24;

import java.util.ArrayList;

public class E8ArrayList {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Lesia");
        names.add("Veronika");
        names.add("Sofiia");
        names.add("Ihor");
        names.add("Nadiya");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Lesia"));
        System.out.println(names.size());
        System.out.println(names);
    }
}
