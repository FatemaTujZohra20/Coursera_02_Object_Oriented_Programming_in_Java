package oop_core_advanced_concepts_practice.animal_inheritance_01;

// Dog inherits from Animal and overrides sound() method
public class Dog extends Animal{
    
    public Dog(String name){
        super(name);
    }
    
    @Override
    public String sound(){
        return "Woof";
    }
    
}
