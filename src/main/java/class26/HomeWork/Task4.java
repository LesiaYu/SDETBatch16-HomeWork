package class26.HomeWork;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        //Create a collection of integers in which you can keep duplicates.
        //Write a logic to find sum of all integers
        List<Integer> Numbers=new ArrayList<>();
        Numbers.add(8);
        Numbers.add(10);
        Numbers.add(56);
        Numbers.add(11);
        Numbers.add(8);
        Numbers.add(19);
        int sum=0;

        for (int i = 0; i < Numbers.size(); i++) {
            sum=Numbers.get(i)+sum;

        }
        System.out.println(sum);
    }
}
