// Type 1: Single Inheritance --> One parents class and one child class
class Person {   // Parents class
    String name;
    int age;
    char gender;

    void walk(){
        System.out.println("Walking...");
    }

    void read(){
        System.out.println("Reading...");
    }
}

// this extends keyword --> This means Child can access all non-private methods and variables of Parent.
class Employee extends Person {    // child class
    int empId; 
    double salary;

    void getPromoted(){
        System.out.println("get promoted...");
    }

    void applyALeave(){
        System.out.println("Applying for a Leave...");
    }
}
public class singleInheritanceType1 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "Alice";
        e1.empId = 123;
        e1.gender = 'F';
        System.out.println(e1.name);
        System.out.println(e1.gender);
        System.out.println(e1.empId);
        e1.walk();
    }
}
