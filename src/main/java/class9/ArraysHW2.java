package class9;

public class ArraysHW2 {
    public static void main(String[] args) {

            //Create an array of names and store all names of your group.
            //Then print your name from that array. (use 2 different ways of creating an array).

        String [] names={"Anna","Egor","Abdul","Lesia","Justin","Hatice","Moncef","Vera"};
        System.out.println(names[3]);

        System.out.println();

        String [] names2=new String[9];
        names2[0]="Anna";
        names2[1]="Egor";
        names2[2]="Abdul";
        names2[3]="Lesia";
        names2[4]="Justin";
        names2[5]="Hatice";
        names2[6]="Moncef";
        names2[7]="Vera";
        System.out.println(names2[3]);
    }
}
