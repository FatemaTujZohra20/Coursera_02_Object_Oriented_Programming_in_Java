package oop_core_advanced_concepts_practice.animal_inheritance_01;

public class AnimalShelterApp {
    public static void main(String[] args) {
        Animal[] animals = new Animal[8];
        
        animals[0] = new Dog("Buddy");
        animals[1] = new Cat("Mimi");
        animals[2] = new Cow("Daisy");
        animals[3] = new Dog("Rocky");
        animals[4] = new Cat("Luna");
        animals[5] = new Cow("Ginger");
        
        for(int i = 0; i < animals.length; i++){
            
            if(animals[i] != null){
                System.out.println(animals[i]);
            }
        }
    }
}
