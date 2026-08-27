package oop_core_advanced_concepts_practice.animal_abstraction_02;

public class Cat extends Animal{
    
    public Cat(String name, int age){
        super(name, age);
    }
    
    @Override
    public void sound(){
        System.out.println(getName() + " says: Meow!");
    }
}
