package oop_core_advanced_concepts_practice.animal_inheritance_01;

public class Cow extends Animal{
    
    public Cow(String name){
        super(name);
    }
    
    @Override
    public String sound(){
        return "Moo";
    }
}
