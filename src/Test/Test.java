package Test;

import java.util.ArrayList;
import java.util.List;
import Test.Employee;



public class Test {
    public static void main(String[] args) {
        List<Employee> employeelist = new ArrayList<>();
        employeelist.add(new Employee("Joe", 123));
        employeelist.add(new Employee("Joe1", 124));
        employeelist.add(new Employee("Joe2", 125));

        for(Employee e:employeelist){
            System.out.println(e.toString());
        }
    }
}
