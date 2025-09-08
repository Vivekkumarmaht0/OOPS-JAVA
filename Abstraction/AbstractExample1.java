abstract class Animal {
    abstract void makeSound();     // abstract method 
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bhow Bhow");
    }
}

abstract class Bank {
    abstract double getInterestOnPersonLoan();
}

class SBI extends Bank {
    @Override
    double getInterestOnPersonLoan() {
        return 7.7;
    }
}

abstract class Polygon {
    abstract void printArea();
    abstract void printPerimeter();
}

class Square extends Polygon {
    int side;
    Square(int side) {
        this.side = side;
    }
    @Override
    void printArea() {
        System.out.println(side * side);
    }
    @Override
    void printPerimeter() {
        System.out.println(4 * side);
    }
}

class Rectangle extends Polygon {
    int length;     // instance variable
    int width;
    Rectangle(int length, int width) {       
        this.length = length;
        this.width = width;
    }
    @Override
    void printArea() {
        System.out.println(length * width);
    }
    @Override
    void printPerimeter() {
        System.out.println(2 * (length + width));
    }
}

public class AbstractExample1 {
    public static void main(String[] args) {
        SBI s1 = new SBI();
        System.out.println(s1.getInterestOnPersonLoan());
        Dog d1 = new Dog();
        d1.makeSound();

        Square s2 = new Square(12);
        s2.printArea();
        s2.printPerimeter();

        Rectangle r1 = new Rectangle(4, 6);
        r1.printArea();
        r1.printPerimeter();
    }
}
