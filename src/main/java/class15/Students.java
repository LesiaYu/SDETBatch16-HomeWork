package class15;

public class Students {
    //Create a Class called Students
    //Create three  variables  Name , ID  and  numberOfStudents
    //Create three objects of the Students Class
    //Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    //Print out  total number of students

 String name;
 String ID;
 static int numberOfStudents;

    public static void main(String[] args) {
        Students one=new Students();
        one.name="Lesia";
        one.ID="123-64L";
        numberOfStudents++;

        Students two=new Students();
        two.name="Nadiia";
        two.ID="56773-64-N";
        numberOfStudents++;

        Students three=new Students();
        three.name="Lesia";
        three.ID="123-64L";
        numberOfStudents++;

        System.out.println(numberOfStudents);


    }

}
