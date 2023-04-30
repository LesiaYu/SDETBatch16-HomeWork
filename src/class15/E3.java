package class15;

public class E3 {

    int sumArr(int [] arr){
        int sum=0;

        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];

        }
        return sum;
    }

    public static void main(String[] args) {

        E3 obj=new E3();
       // int [] arr={76, 87,88};
        int sum=obj.sumArr(new int[]{76, 87,88});
        System.out.println(sum);
    }
}
