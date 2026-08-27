package oop_core_advanced_concepts_practice.animal_abstraction_02;

public class Cow extends Animal{
    
    public Cow(String name, int age){
        super(name, age);
    }
    
    @Override
    public void sound(){
        System.out.println(getName() + " says: Moo!");
    }
}