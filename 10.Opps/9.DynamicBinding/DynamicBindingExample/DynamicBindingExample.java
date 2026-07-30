/*
 * Refers to the process where the method to be invoked is determined at
 * runtime, enabling runtime polymorphism.
 */

class Animal {
    void sound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks"); // Dog barks
    }
}

class DynamicBindingExample {

    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound(); // Decided at runtime, outputs "Dog barks"
    }
}