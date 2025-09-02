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
    static void validateAnimal(Animal x){
        // object instanceof class
        if(x instanceof Cat) {
            System.out.println("It's a Cat");
        } else {
            System.out.println("It's a Dog");
        }
    }
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.makeSound();

        Dog d1 = new Dog();
        d1.makeSound();

        // Explain Dynamic Method Dispatch
        // Decide which overriden method gets executed when a sub-class object is stored in the reference
        // of super class
        Animal a1 = new Cat();
        Animal a2 = new Dog();

        validateAnimal(a1);
        validateAnimal(a2);
    }
}
