package oop_core_advanced_concepts_practice.animal_abstraction_02;

public abstract class Animal {
    
    private String name;
    private int age;
    
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public void displayInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
    
    // Abstract Method
    // Every child class must provide its own implementation.
    public abstract void sound();
    
}
