package class10.Homework;

public class HW3 {
    public static void main(String[] args) {

        //Using 2D array create a grocery list.
        //Inside you should have an array of veggies, fruits, dairy and sweets.
        // Retrieve all values from that array using 2 different loops

        String [][] grosery={
                {"tomato", "cucumber"},
                {"apple","lemon","orange"},
                {"milk", "cheese", "butter"},
                {"choсolate", "ice cream","waffles"}
        };

        for (int i=0; i<grosery.length; i++) {
        for (int j=0; j<grosery[i].length; j++){
            System.out.print(grosery[i][j]+" ");
        }
        }
        System.out.println();

        for (int i = 0; i < grosery.length; i++) {
            String [] gras=grosery[i];
            for (int j=0; j<gras.length; j++){
                System.out.print(gras[j]+" ");
            }


            }

        }


    }

