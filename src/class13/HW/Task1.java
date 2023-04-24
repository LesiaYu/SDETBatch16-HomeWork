package class13.HW;

public class Task1 {
    //How would you reverse a String word by word? for example
    //        // input=>This is sentence i want to reverse
    //        // output=>sihT si ecnetnes i tnaw ot esrever

    public static void main(String[] args) {

        String sentence = "This is sentence i want to reverse";
        System.out.println(sentence);
        StringBuilder sentence1=new StringBuilder(sentence);
        System.out.println(sentence1.reverse());

    }
}
