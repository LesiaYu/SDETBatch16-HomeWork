package GroupTasks;

public class HW10 {
    public static void main(String[] args) {

        //Write a program to print out duplicate elements from an Array of Strings?

        String [] elements={"Table", "Rocki", "Name", "Age", "Xerox", "BMV", "Name"};


        for (int i = 0; i < elements.length; i++) {
            for (int j = i+1; j < elements.length; j++) {

            if (elements[i].equals(elements[j]) && i!=j){
                System.out.println("Duplicate elements is "+ elements[j]);
            }
            }

        }

    }
}
