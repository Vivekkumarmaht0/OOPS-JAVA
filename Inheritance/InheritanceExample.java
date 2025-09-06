// Super-class -> Parent class
class Person {
  String name;
  int age;
  char gender;
  void walk() {
    System.out.println(name + " is walking....");
  }
  void read() {
    System.out.println(name + " is reading....");
  }
}
// First child class -> Single Inheritance
class Employee extends Person {
  int empId;
  double salary;
  String organization;
  void work() {
    System.out.println(name + " is working");
  }
  void applyALeave() {
    System.out.println(name + " has applied a leave");
  }
}
// 2nd children of Person class -> Hierarchical Inheritance
class Student extends Person {
  String rollNumber;
  String branch;
  double cgpa;
  void takeExam() {
    System.out.println(name + "(" + rollNumber + ")  is taking exam");
  }
}
// Multi-Level Inheritance:
// GrandParent -> Person
// Parent -> Employee
// Child -> Professor
class Professor extends Employee {
  String[] subjects;
  String[] papers;
  String branch;
  void takeClass() {
    System.out.println(name + " is taking a class");
  }
  void showSubjects() {
    int i = 1;
    for (String eachSubject: subjects) {
      System.out.println("Sub-" + i + ": " + eachSubject);
      i++;
    }
  }
}
public class InheritanceExample {
  public static void main(String[] args) {
    Person p2 = new Person();
    p2.age = 25;
    p2.name = "Bob";
    p2.gender = 'M';
    p2.walk();
    p2.read();
    // An employee is a Person
    Employee e1 = new Employee();
    e1.name = "Alice";
    e1.age = 18;
    e1.gender = 'F';
    e1.empId = 123;
    e1.organization = "Google";
    e1.salary = 100000;
    e1.work();
    e1.applyALeave();
    e1.walk();
    e1.read();
    // A student is a Person
    Student s1 = new Student();
    s1.name = "Charlie"; // name field is from Parent (Person) class
    s1.age = 18; // age field is from Parent (Person) class
    s1.gender = 'M'; // gender field is from Parent (Person) class
    s1.rollNumber = "24p31a1267";
    s1.branch = "IT";
    s1.cgpa = 8.0;
    s1.walk(); // method from Person class
    s1.read(); // method from Person class
    s1.takeExam();
    // Professor is a Person
    // Professor is an Employee
    Professor p1 = new Professor();
    p1.name = "Professor";
    p1.age = 25;
    p1.papers = new String[5];
    p1.papers[0] = "A new view on AI";
    p1.papers[1] = "A novel approach towards LLMs";
    p1.subjects = new String[4];
    p1.subjects[0] = "C";
    p1.subjects[1] = "Java";
    p1.subjects[2] = "DBMS";
    p1.walk();
    p1.read();
    p1.applyALeave();
    p1.takeClass();
    p1.showSubjects();    
  }
}
