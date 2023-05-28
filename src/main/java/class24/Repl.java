package class24;

import java.util.LinkedList;

public class Repl {
    public static void main(String[] args) {

        LinkedList<Integer> primeNumbers = new LinkedList<>();
        primeNumbers.add(2);
        int count = primeNumbers.size();
        int number = 3;

        while (count != 25) {
            boolean isPrime = true;

            for (int i = 0; i < primeNumbers.size(); i++) {
                if (number % primeNumbers.get(i) == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                primeNumbers.add(number);
            }
            number++;
            count = primeNumbers.size();
        }
        System.out.println(primeNumbers);
    }
}


