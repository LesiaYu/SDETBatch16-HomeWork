package class12.HW;

public class Task1 {
    public static void main(String[] args) {

        //Create a String and if the String is not empty perform the following:
        //if the String has an odd number of characters and has 3 or more characters, print
        // the character in the middle of the String.
        //For Example String str=hello =>l

        String name="hello"; // String name= new String("WERONICATTT");

            if (!name.isBlank() && name.length()%2==1 && name.length()>=3  ){
                    int middleIndex=name.length()/2;
                    System.out.println(name.charAt(middleIndex));

            }else{
                System.out.println("String is empty");
            }

    }
}
