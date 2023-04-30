package class14;

public class E6 {

    boolean isEven(int number){

        boolean isNumEv=false;
        if (number%2==0){
            isNumEv=true;
        }
        return isNumEv;
    }

    public static void main(String[] args) {
        E6 obj=new E6();
        boolean result=obj.isEven(77);
        System.out.println(result);

    }
}
