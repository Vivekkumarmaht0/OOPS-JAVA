class Subjects {
    String name;
    String type;
    int credits;
    Subjects(String name, String type, int credits) {
        this.name = name;
        this.type = type;
        this.credits = credits;
    }
    @Override
    public String toString() {
        return "Subject(" + name + ", " + type + ", " + credits + ")";
    } 
}

class Branch {
    String name;
    String bhavan;
    int floor;
    String hod;
    int code;
    Branch(String name, String bhavan, int floor, String hod, int code) {
        this.name = name;
        this.bhavan = bhavan;
        this.floor = floor;
        this.hod = hod;
        this.code = code;
    }
    @Override
    public String toString() {
        return "Branch(" + name + ", " + bhavan + ", " + floor + ", " + hod + ", " + code + ")";
    }

}

class Student {
    String name;
    String rollNumber;
    int age;
    Branch branch;    // Composition
    Subjects[] subjects;
    // Composition --> Student has Subjects 
    Student(String name, String rollNumber, int age, Branch branch, Subjects[] subjects) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
        this.branch = branch;
        this.subjects = subjects;
    }

    void showStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println(branch);
        for(Subjects sub: subjects) {    // for each loop on subjects
            System.out.println(sub);
        }
    }
}
public class Composition2 {
    public static void main(String[] args) {
        Branch b1 = new Branch("CSE", "Ratan Tata", 2, "XYX", 143);

        Subjects[] subs = {
                            new Subjects("Java", "Theory", 3),
                            new Subjects("Python", "Lab", 1)
                           };
        Student s1 = new Student("Alice", "24P31A05D8", 20, b1, subs);
        s1.showStudentDetails();
    }
}
