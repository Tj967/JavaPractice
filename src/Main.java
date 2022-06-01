import java.util.ArrayList;
import java.util.List;
import Test.Employee;



public class Main {
    public static int addInt(int a,int b, int c){
        return a+b+c;
    }
    public static double addDouble(double a,double b, double c){
        return a+b+c;
    }
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Joe", 123));
        employeeList.add(new Employee("Joe1", 124));
        employeeList.add(new Employee("Joe2", 125));

        for(Employee e:employeeList){
            System.out.println(e.toString());
        }


        System.out.println(addDouble(1.5,2.7,3.3));
        System.out.println(employeeList.contains(new Employee("Mary",22)));
        System.out.println(employeeList.indexOf(new Employee("Mary",22)));
        employeeList.remove(2);

        employeeList.forEach(employee -> {System.out.println(employee);});

        int a= Integer.parseInt(args[0]);
        int b= Integer.parseInt(args[1]);
        int c= Integer.parseInt(args[2]);
        System.out.println(addInt(a,b,c));

        String d= args[3];
        String e= args[4];
        String f= args[5];

        System.out.println(d +" "+ e +" "+ f);
    }
}