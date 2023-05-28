package class22;

public class Array {

    public int numbers(int [] array){
        int sum=0;
        for (int a:array){
            sum=sum+a;
        }return sum;
    }

    public static void main(String[] args) {
         Array arr=new Array();
         int result=arr.numbers(new int[]{34,7,5,6});
        System.out.println(result);

    }
}
