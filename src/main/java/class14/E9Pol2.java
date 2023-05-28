package class14;

public class E9Pol2 {

    boolean isPolindrome(String str) {

        return new StringBuilder(str).reverse().toString().equalsIgnoreCase(str);
    }

        public static void main(String[] args) {
            E8Pol obj=new E8Pol();
            boolean result=obj.isPolindrome("madam");
            System.out.println(result);
        }

}
