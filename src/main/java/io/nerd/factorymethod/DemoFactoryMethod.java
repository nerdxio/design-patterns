package io.nerd.factorymethod;

public class DemoFactoryMethod {
    public static void main(String[] args) {
        Animal animal = AnimalFactory.getAnimal("cat");
        animal.makeSound();
    }
}
