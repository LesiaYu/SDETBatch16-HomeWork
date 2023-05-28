package class22;

public class Find {

      int number(int [] array, int num) {
          for (int i = 0; i < array.length; i++) {
              if (array[i] == num) {
                  return num;
              }
          }return -1;
      }

    public static void main(String[] args) {
        Find obj=new Find();
        int [] array={10,45,34,56};
        int result=obj.number(array, 9);
        System.out.println(result);

    }

}
