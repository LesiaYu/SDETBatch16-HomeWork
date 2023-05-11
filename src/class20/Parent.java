package class20;

public class Parent {

    void getMarry() {
        System.out.println("Marry to the girl of our choice");
    }

    private void accessBankBalance(){
        System.out.println("Accessing bank");
    }

}

class Axel extends Parent{


    @Override
    void getMarry() {
        System.out.println("I want to marry Karol G");
    }
}

class ParentTester{

    public static void main(String[] args) {
        Axel axel=new Axel();
        axel.getMarry();

    }
}