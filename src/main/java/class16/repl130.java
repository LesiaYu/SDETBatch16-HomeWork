package class16;

public class repl130 {

    void mystery(int[] a) {

        for (int i = 0; i < a.length; i++) {

            if (a[i] % 2 == 0) {
                a[i] = a[i] / 2;
            } else if (a[i] % 2 == 1) {
                a[i] = a[i] * 2;
            }
        }
    }

    public static void main(String[] args) {
        repl130 obj=new repl130();
        int[] a = {1,2,3,4,5};

      obj.mystery(a);
        System.out.println(a);


        // should print out 10 1 30 2 50
    }




    }

