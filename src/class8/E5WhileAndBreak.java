package class8;

public class E5WhileAndBreak {
    public static void main(String[] args) {

     boolean summer=true;
     int temp=102;
     while (summer){
        if (temp<100) {
            System.out.println("It's good I enjoy summer");
             break;

        }else {
             System.out.println("It's very hot");
             break;
         }

     } temp = temp + 3;


    }
}
