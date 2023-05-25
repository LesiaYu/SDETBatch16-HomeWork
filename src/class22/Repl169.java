package class22;

public class Repl169 {
    public static void main(String[] args) {
        int[] a = {2,7,3,8,4};
        System.out.println(avgElements(a)); //should print 4.8
    }

    static final double avgElements(int [] a){
        int average=0;
        int count=0;
        int result=0;
        for (int i=0; i<a.length; i++){
            average=average+a[i];
            count++;

        } result=average/count;
        return result;
    }
}
