package Test;

public class Employee {
    String name;
    int id;
    public Employee(String _name, int _id) {
        this.name=_name;
        this.id=_id;
    }

    public String toString(){
        return "Name: "+this.name+" ID: "+this.id;
    }
}
