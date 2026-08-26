package oop_core_advanced_concepts_practice.animal_inheritance_01;

public class Cat extends Animal{
    
    public Cat (String name){
        super(name);
    }
    
    @Override
    public String sound(){
        return "Meow";
    }
}
