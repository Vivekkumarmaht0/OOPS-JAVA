// If a class extends an abstract class, it is forced to give implementation for all
// abstract method present in the parents class if a child class to do so, 
// then it also must be tagged as abstract.

abstract class Animal {
    String speciesType;     // Instance Variable

    // Constructor
    Animal(String speciesType) {
        this.speciesType = speciesType;
    }
    abstract void makeSound();
}

class Cat extends Animal {
    String name;
    Cat(String name, String speciesType){
        super(speciesType);
        this.name = name;
    }
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

class Dog extends Animal {
    String breed;
    Dog(String breed, String speciesType) {
        super(speciesType);
        this.breed = breed;
    }
    @Override
    void makeSound() {
        System.out.println("Woof");
    }
}
public class AbstractExample2 {
    public static void main(String[] args) {
        Cat c1 = new Cat("Alfred", "Carnivore");
        System.out.println(c1.name);
        System.out.println(c1.speciesType);
        Dog d1 = new Dog("Lab", "Carnivore");
        System.out.println(d1.breed);
        System.out.println(d1.speciesType);
    }
}