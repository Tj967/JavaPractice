package Test;

public class Employee {
    String name;
    int id;
    public Employee(String _name, int _id) {
        this.name=_name;
        this.id=_id;
    }

    public String getName(){
        return this.name;
    }
    public int getId() {
        return this.id;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setId(int id){
        this.id=id;
    }
    public String toString(){
        return "Name: "+this.name+" ID: "+this.id;
    }
}
