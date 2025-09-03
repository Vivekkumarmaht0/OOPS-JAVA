class DOB {
    int date;
    int month;
    int year;
    DOB(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }
    @Override
    public String toString() {
        return date + "-" + month + "-" + year;
    }
}

// Student class has a Date of Birth

class Student {
    int id;
    String name;
    DOB dateOfBirth;
    Student(int id, String name, DOB dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }
}

public class CompositionExample {
    public static void main(String[] args) {
        DOB dob1 = new DOB(16, 11, 2007);
        Student s2 = new Student(123, "Bob", dob1);
        Student s1 = new Student(123, "Alice", new DOB(01, 9, 2005));
        System.out.println(s1.id);
        System.out.println(s1.name);
        System.out.println(s1.dateOfBirth);
        System.out.println(s1.dateOfBirth.year);
        System.out.println(s2.dateOfBirth);
    }
}
