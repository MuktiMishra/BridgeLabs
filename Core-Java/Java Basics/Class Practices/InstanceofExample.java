class Animal {
    // Base class
}

class Dog extends Animal {
    // Derived class
}

class Cat extends Animal {
    // Derived class
}

public class InstanceofExample {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Animal();

        
        System.out.println("a1 instanceof Dog: " + (a1 instanceof Dog));     
        System.out.println("a1 instanceof Cat: " + (a1 instanceof Cat));     
        System.out.println("a1 instanceof Animal: " + (a1 instanceof Animal)); 


    }
}
