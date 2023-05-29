package class26;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {

//Create a map of Best Buy store. Place
//item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
//Retrieve all keys and values from a Best Buy map using EntrySet.

        Map<Integer, String> bestBuyStore=new LinkedHashMap<>();
        bestBuyStore.put(788777, "Printer");
        bestBuyStore.put(788778, "TV");
        bestBuyStore.put(788774, "Computer");
        bestBuyStore.put(788770, "Mouse");
        bestBuyStore.put(788779, "TVSet");

        for(var b:bestBuyStore.entrySet()){
            System.out.println(b);
        }

    }
}
