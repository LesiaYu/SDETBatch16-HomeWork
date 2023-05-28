package class22;

public interface ArrayU2 {
    int add(int num1,int num2);
}

class main implements ArrayU2{


    @Override
    public int add(int num1, int num2) {
        return num1+num2;
    }
}