package io.nerd.factorymethod;

public class AnimalFactory {

    public static Animal getAnimal(String animal){
       return switch (animal){
            case "cat" -> new Cat();
            case "dog" -> new Dog();
           default -> null;
        };
    }
}
