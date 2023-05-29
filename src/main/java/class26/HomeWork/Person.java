package class26.HomeWork;

import java.util.TreeMap;

public class Person {

    private String name;
    private String lastName;
    private int age;
    private double salary;

    public Person(String name, String lastName, int age, double salary){
        this.name=name;
        this.lastName=lastName;
        this.age=age;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

class TestClass{
    public static void main(String[] args) {

        TreeMap<Integer,Person> persons=new TreeMap<>();
        persons.put(111, new Person("Lesia", "Yushchyshyn", 36, 1000.0));
        persons.put(222, new Person("Veronika", "Wiliams", 27, 6700.0));
        persons.put(333, new Person("Sofi", "Kenwood", 20, 7800.0));
        persons.put(444, new Person("Ihor", "Sivil", 38, 9900.0));

        for(var v:persons.values()){
            System.out.println(v.toString());
        }
    }
}



