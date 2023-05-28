package GroupTasks;

public class HW1 {
    public static void main(String[] args) {

        // Create a program that uses an array to store a list of
        //temperatures for a week, and then uses a loop to find
        //the highest and lowest temperature for the week.

        int[] temperature = {25, 19, 25, 2, 27, 17, 18};

        int highest = 0;
                for (int i = 0; i < temperature.length; i++) {
            if (temperature[i] > highest) {
                highest = temperature[i];
            }

        }
        System.out.println("The highest temperature is " + highest);

        int lowest = temperature[0];
        for (int i = 0; i < temperature.length; i++) {
            if (lowest > temperature[i]) {
                lowest =temperature[i];

            };
        }System.out.println("The lowest temperature is " + lowest);

    }


}
