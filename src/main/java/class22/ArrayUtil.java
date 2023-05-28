package class22;

public interface ArrayUtil {

    public boolean searchArr(int [] array, int number);


}


class Main implements ArrayUtil{

    @Override
    public boolean searchArr(int[] array, int number) {
        for(int arr: array){
            if (arr==number){
                return true;
            }
        }
        return false;
    }

    public interface ArrayUtil {
        //search the array for the number if found return true
        public boolean searchArr(int [] array,int number);

        double getAvg(double[] arr);
    }
}
