package oop_core_advanced_concepts_practice.animal_abstraction_02;

public class AnimalApp {
    public static void main(String[] args) {
        
        Dog dog = new Dog("Buddy", 3);
        Cat cat = new Cat("Luna", 2);
        Cow cow = new Cow("Bella", 5);
        
        System.out.println("------- Dog --------");
        dog.displayInfo();
        dog.sound();
        
        System.out.println();
        
        System.out.println("--------- Cat --------");
        cat.displayInfo();
        cat.sound();
        
        System.out.println();
        
        System.out.println("--------- Cow ----------");
        cow.displayInfo();
        cow.sound();
        
        System.out.println();
    }
}
