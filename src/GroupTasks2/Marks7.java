package GroupTasks2;

abstract public class Marks7 {
    //We have to calculate the average of marks obtained in three subjects
    //by student A and by student B. Create class 'Marks' with an abstract
    //method 'getPercentage' that will be returning the average percentage
    //of marks. Provide implementation of abstract method in classes 'A'
    //and 'B'. The constructor of student A takes the marks in three
    //subjects as its parameters and the marks in four subjects as its
    //parameters for student B. Test your code

    public abstract double getPercentage();
}

class A extends Marks7 {
    int chemistry;
    int art;
    int maths;
    A(int chemistry, int art, int maths){
        this.chemistry=chemistry;
        this.art=art;
        this.maths=maths;
    }

    public double getPercentage(){
     return (chemistry+art+maths)/3;
    }

}
class B extends Marks7{
    int chemistry;
    int art;
    int maths;
    int english;
    B(int chemistry, int art, int maths, int english){
        this.chemistry=chemistry;
        this.art=art;
        this.maths=maths;
        this.english=english;
    }
    public double getPercentage(){
        return (chemistry+art+maths+english)/4;
    }
}
class MarksTest{

    public static void main(String[] args) {

        Marks7 mark=new A(76,56,99);
        double result=mark.getPercentage();
        System.out.println("The average percentage of marks of student A is "+result);

        Marks7 mark1=new B(77,88,99,100);
        double result2=mark1.getPercentage();
        System.out.println("The average percentage of marks of student B is "+result2);
    }
}