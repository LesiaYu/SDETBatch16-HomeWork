package class9;

public class E5Arrays {
    public static void main(String[] args) {

      // even indexes j+=2 or j%2==0

            char[] chars = {'A','B','C','D','E'};
            for (int j = 0; j < chars.length; j++) {
                if (j%2==0) {
                    System.out.println(chars[j]);
                }

            }
        }
    }

