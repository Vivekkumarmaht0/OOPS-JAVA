// Type 3: Multi-Level Inheritance --> GrandParents -> Parents -> Child
package Inheritance;
class Person {   // Person --> GrandParents
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
class Employee extends Person {    // Employee --> Parents
    int empId; 
    double salary;

    void getPromoted(){
        System.out.println("get promoted...");
    }

    void applyALeave(){
        System.out.println("Applying for a Leave...");
    }
}

class Professor extends Employee {  // Professor --> Child
    String[] subjects;
    String[] papers;
    String branch;

    void takeClass() {
        System.out.println(name + " is taking class");
    }
}
public class multiLevelInheritanceType3 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "Alice";
        e1.empId = 123;
        e1.gender = 'F';
        System.out.println(e1.name);
        System.out.println(e1.gender);
        System.out.println(e1.empId);
        e1.walk();

        // Professor is a person 
        // Professor is an Employee
        Professor p1 = new Professor();
        p1.subjects = new String[5];
        p1.subjects[0] = "C";
        p1.subjects[1] = "Java";
        p1.papers = new String[4];
        p1.papers[0] = "A new view of AI";
        p1.walk();
        p1.takeClass();

    }
}
