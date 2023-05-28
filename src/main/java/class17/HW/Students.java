package class17.HW;

public class Students {
    //Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    // Inside your class also have a method to Calculate Average Grade.
    // Test Student class for 5 different students with different marks.
    // Your program should print an average mark of each students name.

    String name;
    int gradeMaths;
    int gradeBiology;
    int getGradeArt;

    Students(String name, int gradeMaths, int gradeBiology, int getGradeArt){
        this.name=name;
        this.gradeMaths=gradeMaths;
        this.gradeBiology=gradeBiology;
        this.getGradeArt=getGradeArt;
    }

    int CalculateAverageGrade(){
        int count=0;
        count=(gradeMaths+gradeBiology+getGradeArt)/3;
        return count;
    }

    void print(){
        System.out.println(name+" "+CalculateAverageGrade());
    }

}
