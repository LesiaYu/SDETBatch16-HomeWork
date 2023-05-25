package class23;

public class MoveAbleTester {

    public static void main(String[] args) {

        MoveAble moveAble=new Cat();

        WashAble washable=new Dog();
        washable.wash();

        MoveAble [] moveAbles={new Cat(), new Dog()};
        for (MoveAble m:moveAbles){
            m.move();

        }
    }
}
