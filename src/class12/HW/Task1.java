package class12.HW;

public class Task1 {
    public static void main(String[] args) {

        //Create a String and if the String is not empty perform the following:
        //if the String has an odd number of characters and has 3 or more characters, print
        // the character in the middle of the String.
        //For Example String str=hello =>l

        String name="WERONICAT";


            if (name.isBlank()){

            }else if(name.length()%2==1 && name.length()>3){
                int middle=name.length()/2;
                System.out.println(name.charAt(middle));

        }

    }
}
