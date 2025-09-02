package Inheritance;

class Animal {
    void makeSound() {
        System.out.println("Animal is making sound...");
    }
}
class Cat extends Animal{
    @Override
    void makeSound() {
        System.out.println("Meow...");
    }
}
class Dog extends Animal{
    @Override
    void makeSound() {
        System.out.println("Bhow Bhow...");
    }
}
public class MethodOverRiding {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.makeSound();

        Dog d1 = new Dog();
        d1.makeSound();
    }
}
