package class12;

public class E7StringDemo {
    public static void main(String[] args) {

        String sentence="          Java is fun                ";
        System.out.println(sentence);
        System.out.println(sentence.trim());




        String word ="abrakadabra";

        String replace=word.replaceAll("[^aAeEiIoOuU]", "");

        System.out.println(replace);
    }
}
