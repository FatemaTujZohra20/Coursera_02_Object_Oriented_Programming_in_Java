package oop_core_advanced_concepts_practice.animal_inheritance_01;

public class Animal {
    
    private String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    public String sound(){
        return null;
    }
    
    @Override
    public String toString() {
        return name.concat(" says ").concat(sound());
    }
}
