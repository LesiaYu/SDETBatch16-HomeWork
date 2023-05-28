package class18;

public class Teacher {
    //Write a Java program called Teacher.
    // Identify features and 4 behaviour of that Class.
    // Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher . Test all 4 classes
    String name;
    String surname;
    int age;
    double time;

    void teach(){
        System.out.println(name+" "+surname+ " teaches a  lot");
    }
    void go(){
        System.out.println("Go to school in "+age+" years old");
    }
    void sleep(){ System.out.println(name+ " go to sleep at "+time); }
    void work(){ System.out.println(name+ " ,let's do it"); }
}
 class MatsTeacher extends Teacher{

 }
 class ChemistryTeacher extends Teacher{

 }
class PianoTeacher extends Teacher{

}

class TeacherTester{
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        teacher.name="Lesia";
        teacher.surname="Yushchyshyn";
        teacher.teach();

        MatsTeacher matsTeacher=new MatsTeacher();
        matsTeacher.name="Sofiia";
        matsTeacher.age=43;
        matsTeacher.go();

        ChemistryTeacher chemistryTeacher=new ChemistryTeacher();
        chemistryTeacher.name="Veronica";
        chemistryTeacher.work();

        PianoTeacher pianoTeacher=new PianoTeacher();
        pianoTeacher.name="Ihor";
        pianoTeacher.time=10.35;
        pianoTeacher.sleep();



    }

}