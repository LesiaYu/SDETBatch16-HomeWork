package class26.HomeWork;

import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {

        TreeMap<String, Double> employee=new TreeMap<>();
        employee.put("Ihor", 100.500);
        employee.put("Andrii", 59.600);
        employee.put("Nadiya", 87.900);
        employee.put("Lilia", 99.999);

        String getHighestSalary="";
        Double highestSalary=0.0;
        for(var d:employee.entrySet()){
            if(d.getValue()>highestSalary){
                highestSalary=d.getValue();
                getHighestSalary=d.getKey();
            }
        }System.out.println(getHighestSalary+" gets the highest salary "+highestSalary);
    }
}
