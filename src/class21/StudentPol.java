package class21;

public class StudentPol {
    public static void main(String[] args) {

        Student [] student={new SyntaxStudent(),new CollegeStudent(), new SchoolStudent()};

        for (Student stud:student){

            if (stud instanceof SyntaxStudent) {
                ((SyntaxStudent)stud).talk();
            }else if(stud instanceof SchoolStudent){
                ((SchoolStudent)stud).go();
            }
                stud.sleep();
                stud.study();
                stud.feel();
            }



       // SyntaxStudent s=(SyntaxStudent)stud1;
       // s.syntax();

        Student stud1=new SchoolStudent();
        if (stud1 instanceof SyntaxStudent){
                 ((SyntaxStudent)stud1).talk();
        }else{
            System.out.println("Wrong type of object , Type casting not possible");
        }



        Student stud2=new SchoolStudent();
        ((SchoolStudent)stud2).go();



        Animal animal=new Cat("jjj","jj","jjjas");
        if(animal instanceof Cat){
            System.out.println("yep,,,,,,,,,,,,,");
        }else {
            System.out.println("no.................");
        }


    }
}
