import Test.EmployeeLinkedList;
import Test.EmployeeNode;
import Test.Employee;

public class LinkedList {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", 123);
        Employee johnDoe = new Employee("John", 4567);
        Employee marySmith = new Employee("Mary", 22);
        Employee mikeWilson = new Employee("Mike", 3245);

        EmployeeLinkedList list = new EmployeeLinkedList();
        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);
        list.printList();
        System.out.println(list.getSize());
        list.removeFromFront();
        list.printList();
        System.out.println(list.getSize());
        // System.out.println(list.isEmpty());
    }
}
