package Inheritance;

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

class Student extends Person {    // child class
    String rollNo;
    double fee;
    double cgpa;

    void takeExam(){
        System.out.println("Writing a Exam...");
    }
}

public class Inheritance {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "Alice";
        e1.empId = 123;
        e1.gender = 'F';
        System.out.println(e1.name);
        System.out.println(e1.gender);
        System.out.println(e1.empId);
        e1.walk();

        Student s1 = new Student();
        s1.name = "Charlie";
        s1.gender = 'M';
        s1.rollNo = "24P31A05D8";
        System.out.println(s1.name);
        System.out.println(s1.gender);
        System.out.println(s1.rollNo);
        s1.read();
        
    }
}