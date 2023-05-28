package class14;

public class E8Pol {

    //How would you check if String is palindrome or not? aba=> true
    //Abbc =>false
    boolean isPolindrome(String str){

        String reversedStr="";
        for (int i = str.length()-1; i>=0 ; i--) {
            reversedStr=reversedStr+str.charAt(i);
        }

        boolean isStrPolindrome=false;

        if (str.equalsIgnoreCase(reversedStr)){
               isStrPolindrome=true;
            }
        return isStrPolindrome;
    }

    public static void main(String[] args) {
        E8Pol obj=new E8Pol();
        boolean result=obj.isPolindrome("car");
        System.out.println(result);
    }
}
