package class22;

public class Array2 {

    public int numberOfArray(int[] array, int number) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                count++;
            }
        }return count;
    }
}
