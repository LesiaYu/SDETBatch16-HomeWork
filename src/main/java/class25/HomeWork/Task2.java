package class25.HomeWork;

import java.util.HashSet;

public class Task2 {
    public static void main(String[] args) {
        //Create a Set that will hold Objects of Student Type. In this set we do not care about
        // the insertion order.
        // Each student object should have name and studentID. Display name of each student.

        HashSet<studentT> studentType=new HashSet<>();
        studentType.add(new studentT("Lesia","12356L"));
        studentType.add(new studentT("Sofiia", "98877GF"));
        studentType.add(new studentT("Veronica", "0998LO"));
        System.out.println(studentType.toString());
    }
}
class studentT{
    String name;
    String id;
    public studentT(String name, String id){
        this.name=name;
        this.id=id;
    }

    @Override
    public String toString() {
        return "studentT{" +
                "name='" + name + '\'' +
                '}';
    }
}
