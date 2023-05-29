package class26;

import java.util.LinkedHashMap;

public class E4Task {
    public static void main(String[] args) {
//Create a map of a building.
// Store floor number and it is associated company name.
// (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
//Check how many entries you have?
//Update company on a 4th floor
//Remove company on the 7th floor
//Print your map

        LinkedHashMap<Integer, String> building =new LinkedHashMap<>();
        building.put(1,"Google");
        building.put(2,"Syntax");
        building.put(3,"Yahoo");
        building.put(4,"Amazon");
        building.put(5,"Apple");
        building.put(5,"Apple");
        building.put(6,"Sony");
        building.put(7,"YouTube");
        System.out.println(building);

        System.out.println(building.size());

        building.replace(4,"Amazon","Apple");
        System.out.println(building);

        building.remove(7);
        System.out.println(building);


    }
}
